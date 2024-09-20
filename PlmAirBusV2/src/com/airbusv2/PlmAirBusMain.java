package com.airbusv2;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class PlmAirBusMain {
	
	static Map<String, ArrayList<ArrayList<String>>> planesList = DataPlanes.getDataPlanes();
	static String[] menu = {"0- Arreter","1- Afficher la liste des avions", "2- Trier par programme", "3- Acheter une piece", "4- Supprimer un équipement acheté"};
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String continueProgram = "o";
		
		while(continueProgram.equalsIgnoreCase("o")) {
			int menuChoosen = Utils.verifAndReturnChoiceMenu(menu);
			if (menuChoosen == 1) {
				displayPlanes();
				continueProgram = isBackToMenu();
			} else if(menuChoosen == 2) {
		        System.out.println("Saisissez le programme souhaitez ex: A, 320, A350");
				String inputuser = Utils.isEmptyinputUser();
				selectAndReturnProgramList(inputuser);
				continueProgram = isBackToMenu();
			} else if(menuChoosen == 3) {
				BuyAirCrafts.execBuyAirCraft();
				continueProgram = isBackToMenu();
			} else if(menuChoosen == 4) {
				DeleteAirCraft.execDeleteAirCraft();
				continueProgram = isBackToMenu();
			} else if(menuChoosen == 0) {
				System.err.println("Fin du proramme");
				break;
			}
		}	
	}
	
    // afficher la liste des avions
    public static void displayPlanes() {
        for (String plane : planesList.keySet()) {
            System.out.println("----- " + plane + " -----");
            for (ArrayList<String> planeDetails : planesList.get(plane)) {
                for (String detail : planeDetails) {
                    System.out.println(detail);
                }
                System.out.println();
            }
        }
    }
    

	// trier par program et affiche la liste
    public static void selectAndReturnProgramList(String inputuser) {
        String inputProgram = inputuser;
        
        for (String plane : planesList.keySet()) {
        	 if (plane.toLowerCase().contains(inputProgram.toLowerCase())) {
                inputProgram = plane;
                System.out.println(inputProgram);
                for (ArrayList<String> planeDetails : planesList.get(plane)) {
                    for (String detail : planeDetails) {
                        System.out.println(detail);
                    }
                    System.out.println();
                }
        	 }
        }
    }
    
    public static String isBackToMenu() {
		System.out.println("revenir au menu ? O ou N");
		String choice = sc.next();
		if (!choice.equalsIgnoreCase("o")) System.err.println("Fin du programme");
		return choice;
    }
}

