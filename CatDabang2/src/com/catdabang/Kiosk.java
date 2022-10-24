package com.catdabang;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
	public static void main(String[] args) {
		ArrayList<Menu> pick = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Command cmd= new Command();
		System.out.println("****** 캣다방 2 ******");
		
		
		lo:
		while (true) {
			String c = cmd.getCommand("번호를 선택하세요.[1. 구매하기 , 2. 관리자모드 , e. 프로그램 종료 ]");
			
			//메뉴선택장으로 이동
			switch (c) {
			//구매자 모드
			case "1":
				System.out.println("******************** 구매하기 ********************");
				
				Consumer con = new Consumer();
				Consumer.run(pick);										
				break;
				
			//판매자 모드
			case "2":
				System.out.println("관리자 모드");
				System.out.println("관리자 번호를 입력하세요");
				
				String id = sc.next();
				if(id.equals("12345")) {
					System.out.println("확인되셨습니다.");
					Manager ma = new Manager();
					Manager.run(pick);
				}else {
					System.out.println("잘못 입력하셨습니다.");
				}
				
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