package com.airbus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlmAirBus3 {

	// list avion hashmap {A320 : [[id: random, program, status, type]]}
	// un avion [] [id: random, program, status, type]
	static Map<String, String[][]> planesList = new HashMap<String, String[][]>();
	static String[] plane = new String[4];
	static Map<String, String[][]> airCrafts = new HashMap<String, String[][]>();
	/*static String[] airCrfaft = {"airbrakes", "prix", "catégorie"};
	{"airbrakes", "wing", "airflow"}
	{"airbrakes", "wing", "airflow"}*/
	 
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// init planes
		planesList.put("Program: A300", new String[][]{{"ID: 54784ef", " Phase: définition", "Type: fret"},{"ID: 54741ef", " Phase: définition", "Type: Fret"}});
		planesList.put("Program: A320", new String[][] {{"ID: 54484ef", "Phase: définition", "Type: passager"}, {"ID: 54884ef", "Phase: construction", "Type: Militaire"}});
		planesList.put("Program: A350", new String[][] {{"ID: 54494ef", "Phase: en service", "Type: passager"}, {"ID: 54884ef", "Phase: construction", "Type: clôturé"}});
		
		// init aircraft
		airCrafts.put("categorie: Aile", new String[][] {{"prix: 88£", "grande aile droite"}, {"prix: 108£", "petite aile"}});
		airCrafts.put("categorie: Roue", new String[][] {{"prix: 150£", "grande roue"}, {"prix: 108£", "petite roue"}});

		buyAirCraftpart(sc);
	}
	
	public static void buyAirCraftpart(Scanner sc) {
		String getCategorie = selectCategoriesAirCraft(sc);
		System.out.println(getCategorie);
		
	}
	
	public static String selectCategoriesAirCraft(Scanner sc) {
		System.out.println("Saisir le type de piece à acheter");
		for (String airCraft : airCrafts.keySet()) {
			System.out.println(airCraft);
		}
		String inputAirCraft = sc.nextLine();
		return inputAirCraft;
	}
	

}
