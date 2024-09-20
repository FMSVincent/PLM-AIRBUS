package com.airbus;

import java.util.Scanner;

public class PlmAirBusMain {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("1- Afficher les avions");
		while(!sc.hasNextInt()) sc.next();
		int inputUserChoice = sc.nextInt();
		
	}

}
