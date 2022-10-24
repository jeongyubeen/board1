var i = 0;

var stop =true; //true, false



while(true){
    document.write("개");
    i = i + 1;

    if( i == 100 ){

        stop =true;
        // break;
    }

}


// do while (다른 식으로도 처리 할 수 있으므로 알아만 두자)

var i = 0;

var sum = 0;
var i = 1;

do{
    sum = sum + 1;
    i++;
} while(i>10)

alert ( sum );

//continue

var sum = 0;

for (i = 1; i <= 10; i++){
    if ( i % 2 == 1 ){ //홀수 구하는 공식
     continue;
    }
    sum = sum + 1;
}

alert( sum );  //30