



-- ourLength "nebraska" -> 8
ourLength :: [a] -> Integer
ourLength [] = 0
ourLength (h:t) = (ourLength t) + 1

-- addToFront 'N' "ebraska" -> "Nebraska"
addToFront :: a -> [a] -> [a]
addToFront el lst = (el:lst)

-- addToBack 'a' "Nebrask" -> "Nebraska"
addToBack :: a -> [a] -> [a]
addToBack el [] = [el]
addToBack el (h:t) = h:(addToBack el t)

remove :: [a] -> Integer -> [a]
remove [] _ = []
remove (h:t) 0 = t
remove (h:t) n = h:(remove t (n-1))

ourReverse :: [a] -> [a]
ourReverse [] = []
ourReverse (h:t) = (ourReverse t) ++ [h]

getLast :: [a] -> a
getLast [something] = something
getLast (h:t) = getLast t








