module Helpers
( readDominoesFile
, printDomino
, printDominoes
, printHands
, printTrains
) where

import Prelude
import Data.Char
import Data.List
import Debug.Trace

readDominoesFile :: String -> IO ([[(Int,Int)]],[[(Int,Int)]])
readDominoesFile = readIO

intToString :: Int -> [Char]
intToString n
	    | n < 10	= [(intToDigit n)]
	    | otherwise	= (intToString (div n 10)) ++ [(intToDigit (rem n 10))]	   

printDomino :: (Int,Int) -> [Char]
printDomino (f,s) = "[" ++ (intToString f) ++ "|" ++ (intToString s) ++ "]"

printDominoes :: [(Int,Int)] -> [Char]
printDominoes [] = ""
printDominoes (d:ds) = (printDomino d) ++ (printDominoes ds)

printHands :: [[(Int,Int)]] -> IO()
printHands [] = do
	      	print ""
printHands (h:hs) = do
	   	    print (printDominoes h)
		    printHands hs

printTrains :: [[(Int,Int)]] -> IO()
printTrains t = printHands t

