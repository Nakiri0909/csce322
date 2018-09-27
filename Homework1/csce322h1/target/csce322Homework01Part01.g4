grammar csce322Homework01Part01;
// rules
dominoes: trains hands end EOF| hands trains end EOF;
trains: BEGINTITLE TITLE BEGIN list (ENDROW list)* END; 
list: LISTBEGIN (domino)* LISTEND;
domino: DOMINOBEGIN NUMBER COMMA NUMBER DOMINOEND;
hands: BEGINTITLE TITLE BEGIN list (ENDROW list)* END;






//sectionBegin: BEGIN{System.out.println("Begin Section");};
//title: TITLE{System.out.println("Portion: "+$TITLE.text);};
//sectionEnd: END{System.out.println("Conclude Section");};
//listBegin: LISTBEGIN{System.out.println("Begin List");};
//listEnd: LISTEND{System.out.println("Conclude List");};
//dominoBegin: DOMINOBEGIN{System.out.println("Begin Domino");};
//dominoEnd: DOMINOEND{System.out.println("Conclude Domino");};
//number: NUMBER{System.out.println("Half: "+ $NUMBER.text);};
//comma: COMMA;
//endRow: ENDROW{System.out.println("Conclude Row");};
end: {System.out.println("Conclude File");};


// tokens
BEGIN:'<<'{System.out.println("Begin Section");};
END:'>>'{System.out.println("Conclude Section");};
TITLE:'Trains'{System.out.println("Portion: "+getText());}|'Hands'{System.out.println("Portion: "+getText());};
BEGINTITLE:'<';
DOMINOBEGIN:'['{System.out.println("Begin Domino");};
DOMINOEND:']'{System.out.println("Conclude Domino");};
NUMBER:[0-9]{System.out.println("Half: "+ getText());}|[1-9][0-9]{System.out.println("Half: "+ getText());};
ENDROW:'#'{System.out.println("Conclude Row");};
LISTBEGIN:'{'{System.out.println("Begin List");};
LISTEND:'}'{System.out.println("Conclude List");};
COMMA:',';
WS : [\t\r\n ]+ -> skip;
ILLEGAL: .+?{System.out.println("Notification: Problem on Line "+getLine());System.exit(0);};