grammar csce322Homework01Part02;

@members{
	boolean hands;
	boolean played;
	boolean semantic=true;
	boolean more=false;
	int playdominoes=0;
	int players=0;
	int handdominoes=0;
	int dominoes;
	int player1=0;
	int other=0;
	int[] play = new int [20];
	int num=0;
}
// tokens
BEGIN:'<<';
END:'>>';
TRAINS:'Trains';
HANDS:'Hands';
BEGINTITLE:'<';
DOMINOBEGIN:'[';
DOMINOEND:']';
NUMBER:[0-9]|[1-9][0-9];
ENDROW:'#';
LISTBEGIN:'{';
LISTEND:'}';
COMMA:',';
WS : [\t\r\n ]+ -> skip;
ILLEGAL: .+?{System.out.println("Notification: Problem on Line "+getLine());System.exit(0);};
// rules
dominoes: trains hands extra semantics EOF| hands trains extra semantics EOF;
trains: BEGINTITLE TRAINS BEGIN playlist (ENDROW playlist)* END; 
list: LISTBEGIN (domino{handdominoes++;})* LISTEND{players++;};
domino: DOMINOBEGIN NUMBER COMMA NUMBER DOMINOEND;
playlist: LISTBEGIN{play[num]=0;} (playdomino{playdominoes++;play[num]++;})* LISTEND{num++;};
playdomino: DOMINOBEGIN NUMBER COMMA NUMBER DOMINOEND;
hands: BEGINTITLE HANDS BEGIN list (ENDROW list)* END;
semantics:{
	hands=(players<3 || players >10);
	dominoes=handdominoes+playdominoes;
	played=(playdominoes > 0.2*dominoes);
	if(hands){
		System.out.println("Notification : Semantic Problem 1");
		semantic=false;
	}
	if(played){
		System.out.println("Notification : Semantic Problem 2");
		semantic=false;
	}
	if(more){
		System.out.println("Notification : Semantic Problem 3");
		semantic=false;
	}
	if(semantic){
	System.out.println(playdominoes+" dominoes have been played");
	
	}
};
extra:{
	for(int i=0;i<num;i++){
		for(int j=i+1;j<num;j++){
			if(play[i]<(play[j]-1) || play[i]>(play[j]+1)){
				more=true;
			}
		}
	}
	
};


