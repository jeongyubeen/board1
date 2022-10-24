package com.catdabang;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Drink1 {
	public static void run(ArrayList<Menu> pick) {
		Scanner sc = new Scanner(System.in);

		x:
		while(true) {
			
			System.out.println("******************************");
			System.out.println("a.커피메뉴 b.에이드 c.빽스치노 d.추가옵션 0.메인메뉴");
			String cmd = sc.next();
			
			switch (cmd) {
			case "a":
				System.out.println("메뉴를 고르세요[1.에스프레소, 2.앗!메리카노, 3.원조커피, 4.달달연유라떼]");			
				String zz = sc.next();
				String opption = "";
				if(zz.equals("1")) {
					System.out.println("에스프레소 선택");
					pick.add(new Drink("에스프레소",1500,""));
				} else if(zz.equals("2")) {
					System.out.println("앗!메리카노 선택");
					pick.add(new Drink("앗!메리카노",1500,""));
				} else if(zz.equals("3")) {
					System.out.println("원조커피 선택");
					pick.add(new Drink("원조커피",2500,""));
				} else if(zz.equals("4")) {
					System.out.println("달달연유라떼 선택");
					pick.add(new Drink("달달연유라떼",3700,""));
				}		
				break;

			case "b":
				System.out.println("에이드 매뉴를 고르세요[1. 딸기라떼, 2. 완전토마토, 3.배꿀스무디, 4.딸기에이드]");
				
				String x = sc.next();
				if(x.equals("1")) {
					System.out.println("딸기라떼 선택");
					pick.add(new Drink("딸기라떼",4500,"ICED"));
				} else if(x.equals("2")) {
					System.out.println("완전토마토 선택");
					pick.add(new Drink("완전토마토",4000,"ICED"));
				} else if(x.equals("3")) {
					System.out.println("배꿀스무디 선택");
					pick.add(new Drink("배꿀스무디",4500,"ICED"));
				} else if(x.equals("4")) {
					System.out.println("딸기에이드 선택");
					pick.add(new Drink("딸기에이드",4000,"ICED"));
				}
				
				break;
				
			case "c":
				System.out.println("빽스치노 메뉴를 고르세요[1.원조빽스치노, 2.딸기바나나빽스치노, 3.초코바나나빽스치노, 4.퐁당치노]");
				String y = sc.next();
				if(y.equals("1")) {
					System.out.println("원조빽스치노 선택");
					pick.add(new Drink("원조빽스치노",3300,"ICED"));
				} else if(y.equals("2")) {
					System.out.println("딸기에이드 선택");
					pick.add(new Drink("딸기에이드",3300,"ICED"));
				} else if(y.equals("3")) {
					System.out.println("초코바나나빽스치노 선택");
					pick.add(new Drink("초코바나나빽스치노",3300,"ICED"));
				} else if(y.equals("4")) {
					System.out.println("퐁당치노 선택");
					pick.add(new Drink("퐁당치노",3300,"ICED"));
				}
				break;
			
			case "d":
				System.out.println("옵션추가");
				Extra ex = new Extra();
				Extra.run(pick);
				break;
			
			case "0":
				System.out.println("메인메뉴");
				break x;
				
			default:
				System.out.println("다시 입력하세요.");
				break x;
			}
		}	
	}

}
