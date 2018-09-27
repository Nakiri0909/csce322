module.exports = {
    onePlayerOneMove: onePlayerOneMove
}

var helpers = require( './helpers' );

function onePlayerOneMove( train ){
    function whatever( hand ){
       train= changeTrain(train,hand);
	return train;
    }
    return whatever;
}
function changeTrain(train,hand){
    var length=train.length;
    var x=0;

 for(var i=0; i<hand.length;i++){
     if(hand[i][1]==train[0][0]){
     addToFirst(train,i,hand[i])

         break;
     }
     if(hand[i][0]==train[0][0]){
        var t=hand[i][0];
        hand[i][0]=hand[i][1];
        hand[i][1]=t;
        addToFirst(train,i,hand[i])
         break;
     }
     if(hand[i][0]==train[length-1][1]){
       train[length]=hand[i];
       break;
     }
     if(hand[i][1]==train[length-1][1]){
        var t=hand[i][0];
        hand[i][0]=hand[i][1];
        hand[i][1]=t;
        train[length]=hand[i];
        break;
     }
 }



 return train;
}
function addToFirst(train,i,domino){
    for(var i=train.length;i>0;i--){
    train[i]=train[i-1];
    }
    train[0]=domino;
    return train

}

