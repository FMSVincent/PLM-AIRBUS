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
				System.err.println(" .d8b.  db    db d888888b  .d88b.  d8b   db .d8888.      d8888b. d888888b .d8888. d8888b.  .d88b.  d8b   db d888888b d8888b. db      d88888b\r\n"
						+ "d8' `8b 88    88   `88'   .8P  Y8. 888o  88 88'  YP      88  `8D   `88'   88'  YP 88  `8D .8P  Y8. 888o  88   `88'   88  `8D 88      88'    \r\n"
						+ "88ooo88 Y8    8P    88    88    88 88V8o 88 `8bo.        88   88    88    `8bo.   88oodD' 88    88 88V8o 88    88    88oooY' 88      88ooooo\r\n"
						+ "88~~~88 `8b  d8'    88    88    88 88 V8o88   `Y8b.      88   88    88      `Y8b. 88~~~   88    88 88 V8o88    88    88~~~b. 88      88~~~~~\r\n"
						+ "88   88  `8bd8'    .88.   `8b  d8' 88  V888 db   8D      88  .8D   .88.   db   8D 88      `8b  d8' 88  V888   .88.   88   8D 88booo. 88.    \r\n"
						+ "YP   YP    YP    Y888888P  `Y88P'  VP   V8P `8888Y'      Y8888D' Y888888P `8888Y' 88       `Y88P'  VP   V8P Y888888P Y8888P' Y88888P Y88888P");
				displayPlanes();
				continueProgram = isBackToMenu();
			} else if(menuChoosen == 2) {
				System.out.println(",---.       |               |        \r\n"
						+ "|---,---,---|---,---,---,---|---,---.\r\n"
						+ "|  \\|---|   |   |---|   |   |   |---'\r\n"
						+ "`   `---`---`   `---`   `---`   `---'");
		        System.out.println("Saisissez le programme souhaitez ex: A, 320, A350");
				String inputuser = Utils.isEmptyinputUser();
				selectAndReturnProgramList(inputuser);
				continueProgram = isBackToMenu();
			} else if(menuChoosen == 3) {
				System.out.println("   █████████            █████                 █████   \r\n"
						+ "  ███░░░░░███          ░░███                 ░░███    \r\n"
						+ " ░███    ░███   ██████  ░███████    ██████   ███████  \r\n"
						+ " ░███████████  ███░░███ ░███░░███  ░░░░░███ ░░░███░   \r\n"
						+ " ░███░░░░░███ ░███ ░░░  ░███ ░███   ███████   ░███    \r\n"
						+ " ░███    ░███ ░███  ███ ░███ ░███  ███░░███   ░███ ███\r\n"
						+ " █████   █████░░██████  ████ █████░░████████  ░░█████ \r\n"
						+ "░░░░░   ░░░░░  ░░░░░░  ░░░░ ░░░░░  ░░░░░░░░    ░░░░░  ");
				BuyAirCrafts.execBuyAirCraft();
				continueProgram = isBackToMenu();
			} else if(menuChoosen == 4) {
				System.out.println(" ____                         _                     \r\n"
						+ "/ ___| _   _ _ __  _ __  _ __(_)_ __ ___   ___ _ __ \r\n"
						+ "\\___ \\| | | | '_ \\| '_ \\| '__| | '_ ` _ \\ / _ \\ '__|\r\n"
						+ " ___) | |_| | |_) | |_) | |  | | | | | | |  __/ |   \r\n"
						+ "|____/ \\__,_| .__/| .__/|_|  |_|_| |_| |_|\\___|_|   \r\n"
						+ "            |_|   |_|                               ");
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

