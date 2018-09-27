:- module( helpers,
	 [ 
	    readDOC/3
	   ,printDominoes/1
	   ,take/3
	 ]
    ).

readDOC(File,Hands,Trains):-
    open(File,read,Input),
    readAll(Input,All),
    length(All,AllLength),
    RestLength is AllLength - 1,
    take(All,RestLength,Rest),
    Half is RestLength / 2,
    take(Rest,Half,Hands),
    drop(Rest,Half,Trains),
    close(Input).

take(_,0,[]).
take([H|T],N,[H|R]):-
    length([H|T],Len),
    between(1,Len,N),
    NM1 is N - 1,
    take(T,NM1,R).

drop(A,0,A).
drop([H|T],N,R):-
    length([H|T],Len),
    between(1,Len,N),
    NM1 is N - 1,
    drop(T,NM1,R).

readAll(Input,[]):-
    at_end_of_stream(Input),
    !.
readAll(Input,[Row|Rows]):-
    \+ at_end_of_stream(Input),
    read(Input,Row),
    readAll(Input,Rows).

printDominoes([]).
printDominoes([(F,S)]):-
    writeln([F,S]).
printDominoes([(F,S)|Ds]):-
    write([F,S]),
    printDominoes(Ds).
    
