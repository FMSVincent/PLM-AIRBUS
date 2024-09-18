package com.airbus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlmAirBus4 {

	static Map<String, ArrayList<ArrayList<String>>> planesList = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	
    // 4/ Votre appli permet de supprimer une pièce pour un avion, suite à une erreur par ex
	public static void main(String[] args) {
		  
	        // init planes
	        planesList.put("Program: A300", new ArrayList<ArrayList<String>>() {{
	            add(new ArrayList<String>() {{ add("ID: 54784ef"); add("Phase: définition"); add("Type: avions d’affaires"); add("Siege");}});
	            add(new ArrayList<String>() {{ add("ID: 54741ef"); add("Phase: définition"); add("Type: Fret");add("Roue");add("Aile"); }});
	        }});
	        planesList.put("Program: A320", new ArrayList<ArrayList<String>>() {{
	            add(new ArrayList<String>() {{ add("ID: 54484ef"); add("Phase: définition"); add("Type: passager"); add("Siege"); }});
	            add(new ArrayList<String>() {{ add("ID: 54884ef"); add("Phase: construction"); add("Type: Militaire"); add("Ecan");add("Casque");}});
	        }});
	        planesList.put("Program: A350", new ArrayList<ArrayList<String>>() {{
	            add(new ArrayList<String>() {{ add("ID: 54494ef"); add("Phase: en service"); add("Type: passager");add("Radio");add("Emetteur"); }});
	            add(new ArrayList<String>() {{ add("ID: 54884ef"); add("Phase: construction"); add("Type: clôturé"); add("Ecan");add("Trouse de secours");}});
	        }});
	        
	        String programSelected = selectAndReturnProgramList(sc);
	        String[] getProgrmAndID = selectPlane(programSelected, sc);
	        int indexAirCraft = SelectAirCraft(getProgrmAndID);
	        deleteAirCraft(indexAirCraft, getProgrmAndID);
	}
	
	// trier par program et affiche la liste
    public static String selectAndReturnProgramList(Scanner sc) {
        System.out.println("Saisissez le programme souhaitez ex: A, 320, A350");
        String inputProgram = sc.nextLine();
        for (String plane : planesList.keySet()) {
            if (plane.contains(inputProgram)) {
                inputProgram = plane;
                for (ArrayList<String> planeDetails : planesList.get(plane)) {
                    for (String detail : planeDetails) {
                        System.out.println(detail);
                    }
                    System.out.println();
                }
            }
        }
        System.out.println(inputProgram);
        return inputProgram;
    }
    
    // choisir avion dans un program par son ID
    public static String[] selectPlane(String programName, Scanner sc) {
        System.out.println("Ecrire le numero ID pour choisir l'avion" + "\n");
        String inputID = sc.nextLine();
        for (String plane : planesList.keySet()) {
            if (plane.contains(programName)) {
                for (int i = 0; i < planesList.get(plane).size(); i++) {
                    ArrayList<String> planeDetails = planesList.get(plane).get(i);
                    for (int j = 0; j < planeDetails.size(); j++) {
                        if (planeDetails.get(j).equalsIgnoreCase("ID: " + inputID)) {
                            inputID = "ID: " + inputID;
                        }
                    }
                }
            }
        }
        System.out.println(programName+" "+ inputID);
        String[] planeSelected = {programName, inputID};
        return planeSelected;
    }

    // choisir l equipement a supprimer
    public static int SelectAirCraft(String[] getProgrmAndID) {
    	System.out.println("Selectionnez votre equipement a supprimer. ex: 3");

    	for (String plane : planesList.keySet()) {
			if (plane.contains(getProgrmAndID[0])) {
				for (ArrayList<String> planeDetails : planesList.get(plane)) {
					if (planeDetails.get(0).equalsIgnoreCase(getProgrmAndID[1])) {
						for (int i = 0; i < planeDetails.size(); i++) {
							if (i > 2) {
								System.out.println(i+" - "+planeDetails.get(i));
							}
						}
					}
				}
			}
		}
    	int inputIndexCraft = sc.nextInt();
		return inputIndexCraft;
    }
    
    // supprimer equipement
    public static void deleteAirCraft(int indexAirCraft, String[] getProgrmAndID ) {
    	for (String plane : planesList.keySet()) {
			if (plane.contains(getProgrmAndID[0])) {
				for (ArrayList<String> planeDetails : planesList.get(plane)) {
					if (planeDetails.get(0).equalsIgnoreCase(getProgrmAndID[1])) {
						for (int i = 0; i < planeDetails.size(); i++) {
							if (planeDetails.get(i) == planeDetails.get(indexAirCraft)) {
								planeDetails.remove(indexAirCraft);
								System.out.println("Equipement supprimer");
							}
						}System.out.println( planeDetails);
					}  
				}
			}
		}
    }

}
