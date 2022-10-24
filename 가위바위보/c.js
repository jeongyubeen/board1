// 가위바위보게임

window.onload = function(){

    var p
    var com

    var p = 0;
    var p = prompt("가위(1), 바위(2), 보(3) 숫자를 입력하시오");

   if(p == "가위"){
        // document.write("가위");
        p= "1";
    }
    
    else if(p == "바위"){
        // document.write("바위");
        p = "2";
    }
    
    else if(p == "보"){
        // document.write("보");
        p= "3";
    }


    var com = Math.floor(Math.random() *3) +1;
    
    //나 가위
    if(p == 1 && com == 2){
        document.write("player : 가위<br>");
        document.write("com : 바위<br>");
        document.write("당신이 졌습니다.");
    }
    
    if(p == 1 && com == 3){
        document.write("player : 가위<br>");
        document.write("com : 보<br>");
    document.write("당신이 이겼습니다.");
    }

    if(p == 1 && com == 1){
    document.write("player : 가위<br>");
    document.write("com : 가위<br>");
    document.write("비겼습니다.");
    }

    // 나 바위
    if(p == 2 && com ==1){
    document.write("player : 바위<br>");
    document.write("com : 가위<br>");
    document.write("당신이 이겼습니다.");
    }

    if(p == 2 && com == 3){
    document.write("player : 바위<br>");
    document.write("com : 보<br>");
    document.write("당신이 졌습니다.");
    }

    if(p == 2 && com == 2){
    document.write("player : 바위<br>");
    document.write("com : 바위<br>");
    document.write("비겼습니다.");
    }

    // 나 보
    if(p == 3 && com == 1){
    document.write("player : 보<br>");
    document.write("com : 가위<br>");
    document.write("당신이 졌습니다.");
    }

    if(p== 3 && com == 2){
        document.write("player : 보<br>");
        document.write("com : 바위<br>");
        document.write("당신이 익습니다.");
    }
    
    if(p == 3 && com == 3){
        document.write("player : 보<br>");
        document.write("com : 보<br>");
        document.write("비겼습니다.");
    }



}