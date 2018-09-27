% dfs(From,To,Path).

dfs(A,A,[A]).
dfs(A,B,[A|Rest]):-
    edge(A,Next),
    dfs(Next,B,Rest).

ourMember(X,[X|_]).
ourMember(X,[_|T]):-
	ourMember(X,T).

% dfsSmart(From,To,Visited,Path)
dfsSmart(From,From,_,[From]).
dfsSmart(From,To,Visited,[From|Rest]):-
	edge(From,Next),
	not(ourMember(Next,Visited)),
	dfsSmart(Next,To,[From|Visited],Rest).

% bfs(From,To,Path)
bfs(From,From,[From]).
bfs(From,To,[From|Rest]):-
	length(Rest,_),
	edge(From,Next),
	bfs(Next,To,Rest).

edge(a,b).
edge(b,c).
edge(b,d).
edge(b,e).
edge(c,f).
edge(e,b).
edge(e,f).
edge(e,g).
edge(f,c).
edge(f,h).
edge(g,h).
edge(g,j).
edge(h,k).
edge(i,g).
edge(j,i).
edge(k,l).
edge(l,j).

