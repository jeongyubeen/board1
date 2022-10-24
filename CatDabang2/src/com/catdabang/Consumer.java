package com.catdabang;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Consumer {
	public static void run(ArrayList<Menu> pick) {
		Scanner sc = new Scanner(System.in);
		Command cmd= new Command();
		System.out.println("****** 캣다방 2 ******");
		
		
	//TODO 관리자모드
		lo:
		while (true) {
			String c = cmd.getCommand("번호를 선택하세요.[1. 주문 , 2. 장바구니 확인 & 삭제, 3. 결제하기, e. 주문종료 ]");
			
			//메뉴선택장으로 이동
			switch (c) {
			case "1":
				System.out.println("메뉴를 선택하세요.[a. 음료, b. 디저트]");
					
					String food = sc.next();
					if(food.equals("a")) {
						Drink1 d = new Drink1();
						Drink1.run(pick);									
					} else if(food.equals("b")) {
						Dessert1 d2 = new Dessert1();
						Dessert1.run(pick);
					}
				break;
				
			//장바구니 
			//TODO 할인코드
			case "2":
				System.out.println("장바구니를 확인합니다.");
				for(int i = 0; i<pick.size(); i++) {
					if(pick.get(i) instanceof Dessert) {
						System.out.println("선택한 메뉴 : "+pick.get(i).name+" 가격 : "+pick.get(i).price+" 유통기한 : "+" "+((Dessert)pick.get(i)).expirydate);
						
					} else {
						System.out.println("선택한 메뉴 : "+pick.get(i).name+" 가격 : "+pick.get(i).price);												
					}
				}
				
				System.out.println("삭제 할 메뉴 가격을 적으세요. 취소는 e버튼을 누르세요.");
				int DelMenu = sc.nextInt();
				for(int k = 0; k<pick.size(); k++) {
					if(DelMenu == (pick.get(k).price)) {
						System.out.println("선택한 메뉴를 삭제합니다.");
						pick.remove(k);
					}
				}				
				break;		
			
			//결재
			case "3":
				System.out.println("결제 금액을 확인합니다. :");
				
				for(int j = 0; j<pick.size(); j++) {
					if(pick.get(j) instanceof Drink) {
						System.out.println("선택한 메뉴 : "+pick.get(j).name+" 가격 : "+pick.get(j).price);					
					}else if(pick.get(j) instanceof Dessert){
						System.out.println("선택한 메뉴 : "+pick.get(j).name+" 가격 : "+pick.get(j).price+" 유통기한 : "+((Dessert)pick.get(j)).expirydate);
					}else {
						System.out.println("선택한 메뉴 : "+pick.get(j).name+" 가격 : "+pick.get(j).price);					
						
					}
				}
				
				System.out.println("********************************************");
				LocalDateTime cr = LocalDateTime.now();
				System.out.println("주문시간 : "+cr);
				break;
				
			case "e":
				System.out.println("********************** 시스템을 종료합니다 **********************");
				break lo;
			
			default:
				System.out.println("잘못선택하셨습니다.");
				break;
		}
	}
	}

	public static void run() {
				
	}
}
