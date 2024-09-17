package com.airbus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlmAirBus2 {

	// list avion hashmap {A320 : [[id: random, program, status, type]]}
	// un avion [] [id: random, program, status, type]
	static Map<String, String[][]> planesList = new HashMap<String, String[][]>();
	static String[] plane = new String[4];
	 
	

	public static void main(String[] args) {
		
		planesList.put("Program: A300", new String[][]{{"ID: 54784ef", " Phase: définition", "Type: fret"},{"ID: 54741ef", " Phase: définition", "Type: Fret"}});
		planesList.put("Program: A320", new String[][] {{"ID: 54484ef", "Phase: définition", "Type: passager"}, {"ID: 54884ef", "Phase: construction", "Type: Militaire"}});
		planesList.put("Program: A350", new String[][] {{"ID: 54494ef", "Phase: en service", "Type: passager"}, {"ID: 54884ef", "Phase: construction", "Type: clôturé"}});
		
		selectProgramList();
		
	}
	
	public static void selectProgramList(){
		System.out.println("Saisissez le programme souhaitez ex: A, 320, A350");
		Scanner sc = new Scanner(System.in);
		String inputProgram = sc.next();

		for (String plane : planesList.keySet()) {
			if (plane.contains(inputProgram)) {
				for (int i = 0; i < planesList.get(plane).length; i++) {
					for (int j = 0; j < planesList.get(plane)[i].length; j++) {
						System.out.println(planesList.get(plane)[i][j]);
					}
					System.out.println();
				} 
			}
		}
		
		sc.close();
	}

}
