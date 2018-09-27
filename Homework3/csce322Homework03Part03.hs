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
     printTrains (manyPlayersOneMove hands trains)

-- YOUR CODE SHOULD COME AFTER THIS POINT
manyPlayersOneMove :: [[(Int,Int)]] -> [[(Int,Int)]] -> [[(Int,Int)]]
manyPlayersOneMove [] [] = []
manyPlayersOneMove (a:as) (b:bs) = [onePlayerOneMove a b] ++ (manyPlayersOneMove as bs)


onePlayerOneMove :: [(Int,Int)] -> [(Int,Int)] -> [(Int,Int)]
-- onePlayerOneMove _ [()]=[()]
onePlayerOneMove [] train = train
onePlayerOneMove (a:as) train 
  | (findFirst a b == 0) = changeFirst a train noflip
  | (findFirst a b == 1) = changeFirst a train flip
  | (findLast a c == 0) = changeLast a train noflip
  | (findLast a c == 1) = changeLast a train flip
  | otherwise = onePlayerOneMove as train
  where
    noflip = 0
    flip = 1
    b = head train 
    c = last train
    hand = (a:as)




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