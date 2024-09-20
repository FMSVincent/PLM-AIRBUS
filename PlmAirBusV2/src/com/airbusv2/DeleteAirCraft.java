package com.airbusv2;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class DeleteAirCraft {

	static Map<String, ArrayList<ArrayList<String>>> planesList = DataPlanes.planesList;
	static Scanner sc = new Scanner(System.in);
	
	public static void execDeleteAirCraft() {
		
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
    	Boolean isAirCraft = false;
    	int inputIndexCraft = 0;

    	for (String plane : planesList.keySet()) {
			if (plane.contains(getProgrmAndID[0])) {
				for (ArrayList<String> planeDetails : planesList.get(plane)) {
					if (planeDetails.get(0).equalsIgnoreCase(getProgrmAndID[1])) {
						if (planeDetails.size() > 2) {
							for (int i = 0; i < planeDetails.size(); i++) {
								if (i > 2) {
									System.out.println(i+" - "+planeDetails.get(i));
									isAirCraft = true;
								}
							}
						}
					}
				}
			}
		}
    	if (isAirCraft) {
    		System.err.println("Selectionnez votre equipement a supprimer. ex: 3");
    		inputIndexCraft = sc.nextInt();
    	} 
		return inputIndexCraft;
    }
    
    // supprimer equipement
    public static void deleteAirCraft(int indexAirCraft, String[] getProgrmAndID ) {
    	if (indexAirCraft == 0) {
    		System.err.println("Pas d'equipement");
    		return;
    	}
    		
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
