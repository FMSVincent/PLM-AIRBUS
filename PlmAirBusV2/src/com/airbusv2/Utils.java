package com.airbusv2;

import java.util.Scanner;

public class Utils {

	static Scanner sc = new Scanner(System.in);
	
	// verif que l utilisateur rentre un int et le renvoi
	static int verifAndReturnChoiceMenu(String[] menu) {
		System.out.println("         -=\\`\\\r\n"
				+ "     |\\ ____\\_\\__\r\n"
				+ "   -=\\FMS-AirLine`\"\"`)\r\n"
				+ "      `~~~~~/ /~~`\r\n"
				+ "        -==/ /");
		System.out.println("*****************************************");
		System.out.println("███╗   █████████████╗   ████╗   ██╗\r\n"
				+ "████╗ ██████╔════████╗  ████║   ██║\r\n"
				+ "██╔████╔███████╗ ██╔██╗ ████║   ██║\r\n"
				+ "██║╚██╔╝████╔══╝ ██║╚██╗████║   ██║\r\n"
				+ "██║ ╚═╝ ███████████║ ╚████╚██████╔╝\r\n"
				+ "╚═╝     ╚═╚══════╚═╝  ╚═══╝╚═════╝ ");
		for (String m : menu) System.out.println(m);
		System.out.println("*****************************************");
		while(!sc.hasNextInt()) {
			System.out.println("*****************************************");
			System.out.println("███╗   █████████████╗   ████╗   ██╗\r\n"
					+ "████╗ ██████╔════████╗  ████║   ██║\r\n"
					+ "██╔████╔███████╗ ██╔██╗ ████║   ██║\r\n"
					+ "██║╚██╔╝████╔══╝ ██║╚██╗████║   ██║\r\n"
					+ "██║ ╚═╝ ███████████║ ╚████╚██████╔╝\r\n"
					+ "╚═╝     ╚═╚══════╚═╝  ╚═══╝╚═════╝ ");
			for (String m : menu) System.out.println(m); 
			System.out.println("*****************************************");
			sc.next();
		}
		int inputUserChoiceMenu = sc.nextInt();
		while(inputUserChoiceMenu > menu.length || inputUserChoiceMenu < 0) {
			System.out.println("*****************************************");
			System.out.println("███╗   █████████████╗   ████╗   ██╗\r\n"
					+ "████╗ ██████╔════████╗  ████║   ██║\r\n"
					+ "██╔████╔███████╗ ██╔██╗ ████║   ██║\r\n"
					+ "██║╚██╔╝████╔══╝ ██║╚██╗████║   ██║\r\n"
					+ "██║ ╚═╝ ███████████║ ╚████╚██████╔╝\r\n"
					+ "╚═╝     ╚═╚══════╚═╝  ╚═══╝╚═════╝ ");
			for (String m : menu) System.out.println(m);
			System.out.println("*****************************************");
			while(!sc.hasNextInt()) sc.next();
			inputUserChoiceMenu = sc.nextInt();
	
		}
		sc.nextLine();
		return inputUserChoiceMenu;
	}
	
	// verifi si l'entrée user est vide
	static String isEmptyinputUser() {
		String inputUser = sc.nextLine();
		while (inputUser.equals("")) {
			System.err.println("le champ ne peut pas etre vide.");
			System.out.println("En attente d'une entrée: ");
			inputUser = sc.nextLine();	
		}
		return inputUser;
	}
}
