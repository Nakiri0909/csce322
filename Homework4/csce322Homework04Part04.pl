getNext(Hand,Domino,Next) :-
    member(H,Hand),
    findall(H,b(Domino,H),Q),
    member(Next,Q).


b((Q,P),(X,Y)):-
    
    member(Q,[X,Y]).