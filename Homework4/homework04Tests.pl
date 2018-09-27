printSequences([]).
printSequences([Sequence|Sequences]):-
    writeln(Sequence),
    printSequences(Sequences).

loadHelpers:-
    ['helpers'],
    ['csce322Homework04Part01'],
    ['csce322Homework04Part02'],
    ['csce322Homework04Part03'],
    ['csce322Homework04Part04'].
    
part01:-
    readDOC('part01test01.doc',Hands,_),
    writeln(hands),
    writeln(Hands),
    haveDoubles(Hands).
    
part02:-
    readDOC('part02test01.doc',[Hand|_],[Train|_]),
    writeln(hand),
    writeln(Hand),
    Train = [Front|_],
    writeln(front),
    writeln(Front),
    percentMatch(Hand,Front).

part03:-
    readDOC('part03test01.doc',[H|_],[[T|_]|_]),
    Hnd = [T|H],
    take(Hnd,5,Hand),
    writeln(hand),
    writeln(Hand),
    setof(Train,longestTrain(Hand,Train),AllTrains),
    writeln(trains),
    printSequences(AllTrains).
  
part04:-
    readDOC('part04test01.doc',[Hand|_],[[Double|_]|_]),
    writeln(hand),
    writeln(Hand),
    writeln(double),
    writeln(Double),
    setof(Next,getNext(Hand,Double,Next),AllNexts),
    printSequences(AllNexts).
