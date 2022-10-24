package com.catdabang;

import java.util.ArrayList;
import java.util.Scanner;

public class Dessert1 {
	public static void run(ArrayList<Menu> pick) {
		Scanner sc = new Scanner(System.in);
	
		x:
		while(true) {
			System.out.println("******************************");
			System.out.println("종류를 고르세요[a. 빵, b. 소프트아이스크림, 0. 메인메뉴]");
			String cmd = sc.next();
			switch (cmd) {
			case "a":
				System.out.println("메뉴를 고르세요[1.사라다빵 2.크리미슈 3.큰마들렌]");			
				String zz = sc.next();
				if(zz.equals("1")) {
					System.out.println("사라다빵 선택");
					pick.add(new Dessert("사라다빵",3000,10,"20220810"));
				} else if(zz.equals("2")) {
					System.out.println("크리미슈 선택");
					pick.add(new Dessert("크리미슈",1800,10,"20220810"));
				} else if(zz.equals("3")) {
					System.out.println("큰마들렌 선택");
					pick.add(new Dessert("큰마들렌",2800,10,"20220810"));
				}
				
				break;

			case "b":
				System.out.println("아이스크림 종류를 고르세요[1. 노말한 아이스크림 2.호떡아이스크림 3.달고나크런치]");
				
				String x = sc.next();
				if(x.equals("1")) {
					System.out.println("노말한 아이스크림 선택");
					pick.add(new Dessert("노말한 아이스크림",2000,10,"20220810"));
				} else if(x.equals("2")) {
					System.out.println("호떡아이스크림 선택");
					pick.add(new Dessert("호떡아이스크림",2500,10,"20220810"));
				} else if(x.equals("3")) {
					System.out.println("달고나크런치 선택");
					pick.add(new Dessert("달고나크런치",2500,10,"20220810"));
				} 
				break;
			
			case "0":
				System.out.println("메인메뉴");
				break x;
				
			default:
				System.out.println("다시 입력하세요.");
				break;
			}
		}
		
	}
}
