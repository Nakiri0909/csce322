 percentMatch(Hand,Domino):-
  a(Hand,Domino,L),
  length(Hand,All),
  L / All >= 0.1.

a([],_,0).
a([H|T],Domino,L):-
  b(H,Domino),
  a(T,Domino,E),
  L is E + 1.

a([H|T],Domino,L):-
  
  a(T,Domino,L).


b((Q,P),(X,Y)):-
    
    member(Q,[X,Y]).
b((Q,P),(X,Y)):-
    
    member(P,[X,Y]).





  


