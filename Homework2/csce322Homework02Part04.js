module.exports = {
    manyPlayersManyMoves: manyPlayersManyMoves
}

var helpers = require( './helpers' );

function manyPlayersManyMoves( trains ){
    function whatever( hands ){
        for(var i=0;i<trains.length;i++){
            trains[i]=findDomino(trains[i],hands[i]);
            }
	return trains;
    }
    return whatever;
}
function findDomino(train,hand){
    var t=[];
    var x;
    var length=hand.length;
    for(var i=0;i<length;i++){
      t=changeTrain(train,hand);
      
      if(t[0]==-1){
        
      }else{
      if(t[2]==1){
          train=addToFirst(train,t,hand);
          
         // hand[x][0]=-1;
         // hand[x][1]=-1;
      }else if (t[2]==2){
          train=addToEnd(train,t,hand);
         // hand=changeHand(hand,t[0]);
         // hand[x][0]=-1;
         // hand[x][1]=-1;
      }
      hand=changeHand(hand,t[0]);
    }
     
    }

    return train;
}

function changeTrain(train,hand){
    var length=train.length;
    
    var x=0;
    var t=[];
    t[1]=0;
    t[2]=0
    t[0]=-1;
 for(var i=0; i<hand.length;i++){
     if(hand[i][1]==train[0][0]){
    //  addToFirst(train,i,hand[i])
     t[0]=i;
     t[2]=1;
         break;
     }
     if(hand[i][0]==train[0][0]){
        // var t=hand[i][0];
        // hand[i][0]=hand[i][1];
        // hand[i][1]=t;
        // addToFirst(train,i,hand[i])
        t[0]=i;
        t[1]=1;
        t[2]=1;
         break;
     }
     if(hand[i][0]==train[length-1][1]){
    //    train[length]=hand[i];
       t[0]=i;
       t[2]=2;
       break;
     }
     if(hand[i][1]==train[length-1][1]){
        // var t=hand[i][0];
        // hand[i][0]=hand[i][1];
        // hand[i][1]=t;
        // train[length]=hand[i];
        t[0]=i;
        t[1]=1;
        t[2]=2;
        break;
     }
     
   
 }
 return t;
}
function addToFirst(train,t,hand){
    var x=t[0];
    if(t[1]==1){
        var a=hand[x][0];
        hand[x][0]=hand[x][1];
        hand[x][1]=a;
    }
    for(var i=train.length;i>0;i--){
    train[i]=train[i-1];
    }
    var x1=hand[x][0];
    var x2=hand[x][1];
    train[0]=[x1,x2];
    return train;

}
function addToEnd(train,t,hand){
    var length=train.length;
    var x=t[0];
    if(t[1]==1){
        var a=hand[x][0];
        hand[x][0]=hand[x][1];
        hand[x][1]=a;
    }
    var x1=hand[x][0];
    var x2=hand[x][1];
    train[length]=[x1,x2];
    
    return train;

}
function changeHand(hand,x){
    hand[x][0]='a';
    hand[x][1]='a';
    return hand;
}
