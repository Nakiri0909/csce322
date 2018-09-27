module.exports = {
    manyPlayersOneMove: manyPlayersOneMove
}

var helpers = require( './helpers' );

function manyPlayersOneMove( trains ){
    function whatever( hands ){
        
        for(var i=0;i<trains.length;i++){
        trains[i]=changeTrain(trains[i],hands[i]);
        }
	return trains;
    }
    return whatever;
}
function changeTrain(train,hand){
    var length=train.length;
    //var x=0;

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

