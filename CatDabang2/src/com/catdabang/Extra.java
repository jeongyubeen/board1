package com.catdabang;

import java.util.ArrayList;

public class Extra {

	public static void run(ArrayList<Menu> pick) {
		System.out.println("********** 옵션을 선택하세요 ***********");
		Command cmd = new Command();
		
		loop:
		while (true) {
			String c = cmd.getCommand("추가할 옵션을 선택하세요[1.HOT , 2. ICED, 3. 샷추가, 4. 헤이즐넛시럽 5.사이즈업, e.이전메뉴]");
			
			switch (c) {
			case "1":
				System.out.println("HOT 선택함");
				pick.add(new Menu("HOT",0));
				break;

			case "2":
				System.out.println("ICED 선택함");
				pick.add(new Menu("ICED",500));
				break;

			case "3":
				System.out.println("샷추가 선택함");
				pick.add(new Menu("샷추가",500));
				break;

			case "4":
				System.out.println("헤이즐넛 시럽 선택함");
				pick.add(new Menu("헤이즐넛 시럽",500));
				break;

			case "5":
				System.out.println("사이즈업 선택함");
				pick.add(new Menu("사이즈업",500));
				break;

			case "e":
				System.out.println("이전으로 돌아갑니다.");
				break loop;	
				
			default:
				System.out.println("존재하지 않는 extra메뉴입니다.");
				break;
			}
			
		}

	}
}