package com.airbus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlmAirBus {

	// list avion hashmap {A320 : [id: random, program, status, type]}
	// un avion [] [id: random, program, status, type]
	static Map<String, String[][]> planesList = new HashMap<String, String[][]>();
	static String[] plane = new String[4];
	 
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		planesList.put("Program: A300", new String[][]{{"ID: 54784ef", " Phase: définition", "Type: fret"},{"ID: 54741ef", " Phase: définition", "Type: Fret"}});
		planesList.put("Program: A320", new String[][] {{"ID: 54484ef", "Phase: définition", "Type: passager"}, {"ID: 54884ef", "Phase: construction", "Type: Militaire"}});
		planesList.put("Program: A350", new String[][] {{"ID: 54494ef", "Phase: en service", "Type: passager"}, {"ID: 54884ef", "Phase: construction", "Type: clôturé"}});
		
		System.out.println("Souhaitez-vous afficher les avions ? o or n");
		String askUserToDiplayPlanesList = 
		
		displayPlane();
		
	}
	
	// 1
	public static void displayPlane() {

		for (String plane : planesList.keySet()) {
			System.out.println("----- "+plane+" -----");
			for (int i = 0; i < planesList.get(plane).length; i++) {
				for (int j = 0; j < planesList.get(plane)[i].length; j++) {
					System.out.println(planesList.get(plane)[i][j]);
				}
				System.out.println();
			} 
		}
	}

}
