haveDoubles([H|T]):-
   not_a(H), !, fail.

haveDoubles([H|T]):-
   haveDoubles(T).
haveDoubles([]).
 

   

a([H|T]):-
   b(H).
a([H|T]):-
   a(T).

b((X,Y)):-
   X = Y.

not_a(H):-
   \+ a(H).


