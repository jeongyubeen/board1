package com.catdabang;

import java.util.Scanner;

public class Command {
	public String getCommand(String guide) {
			Scanner sc = new Scanner(System.in);
			System.out.println(guide);
			String cmd = sc.next();
			return cmd;
	}
}
