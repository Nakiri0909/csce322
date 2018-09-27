import Prelude
import System.Environment ( getArgs )
import Data.List
import Helpers

-- The main method that will be used for testing / comgand line access
main = do
     args <- getArgs
     filename <- readFile (head args)
     (hands,trains) <- readDominoesFile filename
     print "Result"
     printTrains (manyPlayersManyMoves hands trains)

-- YOUR CODE SHOULD COME AFTER THIS POINT
manyPlayersManyMoves :: [[(Int,Int)]] -> [[(Int,Int)]] -> [[(Int,Int)]]
manyPlayersManyMoves [] [] = []
manyPlayersManyMoves (a:as) (b:bs) = [onePlayerManyMove a b a] ++ (manyPlayersManyMoves as bs)


onePlayerManyMove :: [(Int,Int)] -> [(Int,Int)] -> [(Int,Int)] -> [(Int,Int)]
-- onePlayerOneMove _ [()]=[()]
onePlayerManyMove [] train hand = train
onePlayerManyMove (a:as) train hand 
  | (findFirst a b == 0) = onePlayerManyMove (changeHand a hand) (changeFirst a train noflip) (changeHand a hand)
  | (findFirst a b == 1) = onePlayerManyMove (changeHand a hand) (changeFirst a train flip) (changeHand a hand)
  | (findLast a c == 0) = onePlayerManyMove (changeHand a hand) (changeLast a train noflip) (changeHand a hand)
  | (findLast a c == 1) = onePlayerManyMove (changeHand a hand) (changeLast a train flip) (changeHand a hand)
  | otherwise = onePlayerManyMove as train hand 
  where
    noflip = 0
    flip = 1
    b = head train 
    c = last train

    




findFirst :: (Int,Int) -> (Int,Int) -> Int
findFirst (f,l) (ft,lt)
 | (l == ft) = 0
 | (f == ft) = 1
 | otherwise = 2



findLast :: (Int,Int) -> (Int,Int) -> Int
findLast (f,l) (ft,lt)
  | (f == lt) = 0
  | (l == lt) = 1
  | otherwise = 2

changeFirst :: (Int,Int) -> [(Int,Int)] -> Int -> [(Int,Int)]
changeFirst domino train a 
   | (a == 0) = [domino] ++ train
   | otherwise = [flipped domino] ++ train

changeLast :: (Int,Int) -> [(Int,Int)] -> Int -> [(Int,Int)]
changeLast domino train a 
   |(a == 0) = train ++ [domino] 
   | otherwise = train ++ [flipped domino]

flipped :: (Int,Int) -> (Int,Int)
flipped (a,b) = (b,a)

changeHand :: (Int,Int) -> [(Int,Int)] -> [(Int,Int)]
changeHand domino hand = filter (domino /=) hand 

