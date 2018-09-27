longestTrain(Hand,Train):-
  findall(All,find(Hand,[],N,All),Alllist),
  findall(M, (member(New,Alllist),length(New,M)),Alllength),
  max_list(Alllength,Want),

  member(Train, Alllist),
  length(Train,Want).

find(Hand,R,New,All):-
 double(Hand,H),
 getT(Hand,H,T),
 append([H],R,Rr),
 find0(H,T,Rr,New,T,All).
 
getT(Hand,H,T):-
select(H,Hand,T).


find0(H,T,R,New,T,All):-

   

   find1(H,T,L,R,New,T,All).
  
 addToFront(Element,List,[Element|List]).
 addToBack(Element,Before,After):-
	    append(Before,[Element],After).  


find1((X,Y),[(Q,P)|_],L,R,New,Oldlist,All):-
  b((X,Y),(Q,P)),
  element((Q,P),E),
  addToBack(E,R,New),
  select((Q,P),Oldlist,L),
  
find1((X,P),L,NewLeft,New,NewN,L,All).

find1((X,Y),[(Q,P)|_],L,R,New,Oldlist,All):-
  f((X,Y),(Q,P)),
  element((Q,P),E),
  addToFront(E,R,New),
  select((Q,P),Oldlist,L),
 find1((Q,Y),L,NewLeft,New,NewN,L,All).

find1((X,Y),[(Q,P)|_],L,R,New,Oldlist,All):-
  br((X,Y),(Q,P)),
  element((P,Q),E),
  addToBack(E,R,New),
  select((Q,P),Oldlist,L),
find1((X,Q),L,NewLeft,New,NewN,L,All).

find1((X,Y),[(Q,P)|_],L,R,New,Oldlist,All):-
  fr((X,Y),(Q,P)),
  element((P,Q),E),
  addToFront(E,R,New),
  select((Q,P),Oldlist,L),
  
 find1((P,Y),L,NewLeft,New,NewN,L,All).


find1((X,Y),[(Q,P)|T],L,R,New,Oldlist,All):-
    find1((X,Y),T,L,R,New,Oldlist,All).

find1(_,[],_,All,_,_,All).

copy(A,A).

double([(X,Y)|T],A):-
  X = Y,
  createHead(X,Y,A).

double([(X,Y)|T],A):-
  double(T,A).

createHead(A,B,(A,B)).


element((A,B),(A,B)).
 
b((X,Y),(Q,P)):-
    Y = Q.
f((X,Y),(Q,P)):-
    X = P.
br((X,Y),(Q,P)):-
    Y = P.
fr((X,Y),(Q,P)):-
    X = Q.

ad((Q,P),[(Q,P)]).