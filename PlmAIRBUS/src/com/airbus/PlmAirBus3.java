package com.airbus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlmAirBus3 {
    // list avion hashmap {A320 : [[id: random, program, status, type]]}
    static Map<String, ArrayList<ArrayList<String>>> planesList = new HashMap<>();
    static Map<String, ArrayList<ArrayList<String>>> airCrafts = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // init planes
        planesList.put("Program: A300", new ArrayList<ArrayList<String>>() {{
            add(new ArrayList<String>() {{ add("ID: 54784ef"); add("Phase: définition"); add("Type: avions d’affaires"); }});
            add(new ArrayList<String>() {{ add("ID: 54741ef"); add("Phase: définition"); add("Type: Fret"); }});
        }});
        planesList.put("Program: A320", new ArrayList<ArrayList<String>>() {{
            add(new ArrayList<String>() {{ add("ID: 54484ef"); add("Phase: définition"); add("Type: passager"); }});
            add(new ArrayList<String>() {{ add("ID: 54884ef"); add("Phase: construction"); add("Type: Militaire"); }});
        }});
        planesList.put("Program: A350", new ArrayList<ArrayList<String>>() {{
            add(new ArrayList<String>() {{ add("ID: 54494ef"); add("Phase: en service"); add("Type: passager"); }});
            add(new ArrayList<String>() {{ add("ID: 54884ef"); add("Phase: construction"); add("Type: clôturé"); }});
        }});

        // init aircraft
        airCrafts.put("Ailes", new ArrayList<ArrayList<String>>() {{
            add(new ArrayList<String>() {{ add("prix: 88£"); add("grande aile droite"); }});
            add(new ArrayList<String>() {{ add("prix: 108£"); add("petite aile"); }});
        }});
        airCrafts.put("Roues", new ArrayList<ArrayList<String>>() {{
            add(new ArrayList<String>() {{ add("prix: 150£"); add("grande roue"); }});
            add(new ArrayList<String>() {{ add("prix: 108£"); add("petite roue"); }});
        }});

        String airCraftBought = selectAirCraftToBuy(sc);
        // displayPlanes();
        String programSelected = selectAndReturnProgramList(sc);

        // ajouter la piece a l'avion airCraftBought
        selectPlaneAddAircraft(programSelected, airCraftBought, sc);

        displayPlanes();
        sc.close();
    }

    // choisir avion et ajouter piece
    public static void selectPlaneAddAircraft(String programName, String airCraftBought, Scanner sc) {
        System.out.println("choisir l'avion pour ajouter la piece acheté " + "'" + airCraftBought + "'" + " Ecrire le numero ID" + "\n");
        String inputID = sc.nextLine();
        for (String plane : planesList.keySet()) {
            if (plane.contains(programName)) {
                for (int i = 0; i < planesList.get(plane).size(); i++) {
                    ArrayList<String> planeDetails = planesList.get(plane).get(i);
                    for (int j = 0; j < planeDetails.size(); j++) {
                        if (planeDetails.get(j).equalsIgnoreCase("ID: " + inputID)) {
                            planeDetails.add(airCraftBought); // ajout de la piece acheté
                        }
                    }
                }
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

    // trier par program
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

    // choisir quelle equipement acheté
    public static String selectAirCraftToBuy(Scanner sc) {
        String getCategorie = selectCategoriesAirCraft(sc);
        int indexAirCraftSelected = displayAirCraftsByCategorie(getCategorie, sc);
        String airCraftname = selectAirCraftname(indexAirCraftSelected, getCategorie);
        return airCraftname;
    }

    // retourne l'équipement choisis
    public static String selectAirCraftname(int indexAirCraftSelected, String categorie) {
        String aircraftName = "";
        for (String aircraft : airCrafts.keySet()) {
            if (aircraft.equalsIgnoreCase(categorie)) {
                aircraftName = airCrafts.get(aircraft).get(indexAirCraftSelected).get(1);
            }
        }
        return aircraftName;
    }

    // retourne la categorie choisis
    public static String selectCategoriesAirCraft(Scanner sc) {
        System.out.println("-----Choisir la categorie à acheter. ex : Roues -----" + "\n");
        displayCategorieList();

        String inputAirCraft = sc.nextLine();

        for (String categorie : airCrafts.keySet()) {
            if (categorie.equalsIgnoreCase(inputAirCraft)) {
                return inputAirCraft;
            }
        }
        return "introuvable";
    }

    // affiche les titres des categories
    public static void displayCategorieList() {
        for (String airCraft : airCrafts.keySet()) {
            System.out.println("categorie: " + airCraft);
        }
    }

    // affiche la liste des équipements de la categorie et retourne l'index
    public static int displayAirCraftsByCategorie(String categorie, Scanner sc) {
        for (String airCraft : airCrafts.keySet()) {
            if (airCraft.equalsIgnoreCase(categorie)) {
                System.out.println("----- Choisir la piece à acheter. ex : 1 -----" + "\n");
                for (int i = 0; i < airCrafts.get(airCraft).size(); i++) {
                    System.out.println(i);
                    ArrayList<String> aircraftDetails = airCrafts.get(airCraft).get(i);
                    for (String detail : aircraftDetails) {
                        System.out.println(detail);
                    }
                    System.out.println("------------");
                }
            }
        }
        int inputAirCraftSelected = sc.nextInt();
        sc.nextLine(); //  vider le flux !!!!!!!!!!!!!!!!!!!!!!!
        return inputAirCraftSelected;
    }
}
