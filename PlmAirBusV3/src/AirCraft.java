import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class AirCraft {
	
	static Scanner sc = new Scanner(System.in);
	
	static public void airCraftsManagement() {
		boolean isAirCraftMenu = true;
		System.out.println("Saisissez l'id de l'avion concerné: ");
		int inputUserIndexPlane = Utils.verifIfIntArr2D("ID inconnu", PlmAirBusV3.listDataPlanes);
		PlmAirBusV3.selectPlaneByIndex(inputUserIndexPlane);


		while(isAirCraftMenu) {
			Utils.displayAsciiAirCraftsMenu();
			
			while(!sc.hasNextInt()) sc.next();
			int inputUserMenuChoosen = sc.nextInt();
			
			switch (inputUserMenuChoosen) {
			case 1:
				displayListAirCrafts(PlmAirBusV3.listAirCrafts);
				break;
			case 2:
				buyAirCraft(inputUserIndexPlane, PlmAirBusV3.listAirCrafts);
				break;
			case 3:
				deleteAirCraftToPlane(inputUserIndexPlane);
				break;
			case 4:
				isAirCraftMenu = false;
				PlmAirBusV3.main(null);
				break;
			default:
				break;
			}
		}
	}

	static public void displayListAirCrafts(List<ArrayList<String>> listAirCrafts) {
		System.out.println("ID - NOM - Catégorie - Prix");
		for (int i = 0; i < listAirCrafts.size(); i++) {
			System.out.println(i+" - "+listAirCrafts.get(i));
		}
		System.out.println("******************************");
	}

	static public void buyAirCraft(int inputUserIndexPlane, List<ArrayList<String>> listAirCrafts) {
		System.out.println("Saisissez l'id de la piece concerné");
		int inputIndexAirCraft = Utils.verifIfIntArr2D("Saisissez l'id de la piece concerné", listAirCrafts);
		String airCraftchoosen =  airCraftsSelected(inputIndexAirCraft);
		addAirCraftToPlane(inputUserIndexPlane, airCraftchoosen);
	}
	
	static public String airCraftsSelected(int indexAircraft){
		String nameAirCraft = PlmAirBusV3.listAirCrafts.get(indexAircraft).get(0);
		return  nameAirCraft;
	}
	
	static public void addAirCraftToPlane(int inputUserIndexPlane, String airCraftchoosen) {
		PlmAirBusV3.listDataPlanes.get(inputUserIndexPlane).add(airCraftchoosen);
		System.out.println(PlmAirBusV3.listDataPlanes.get(inputUserIndexPlane));
	}
	
	static public void deleteAirCraftToPlane(int inputUserIndexPlane) {
		System.out.println("Saisissez le nom de la piece a supprimer");
		sc.nextLine();// !!!!!!!!!!!!!!!!Vidage du flux !!!!!!!!!!!!!!!!!!!!
		String airCraftchoosen = sc.nextLine();
		if (Utils.containWithIgnoreCase(PlmAirBusV3.listDataPlanes.get(inputUserIndexPlane), airCraftchoosen)) {
			PlmAirBusV3.listDataPlanes.get(inputUserIndexPlane).removeIf(aircraf -> aircraf.equalsIgnoreCase(airCraftchoosen.trim()));
			System.err.println("Suppression réussi");
			PlmAirBusV3.selectPlaneByIndex(inputUserIndexPlane);
		}
		else System.err.println("Existe pas");
	}
	
	static public boolean getAirCraftByName(String nameAirCraft, List<ArrayList<String>> arr) {
		boolean isAirCraft = false;
		for (ArrayList<String> aircraft : arr) {
			if (Utils.containWithIgnoreCase(aircraft, nameAirCraft)) {
				isAirCraft = true;
				System.out.println(aircraft);
			}
		}
		return isAirCraft;
	}
}
