import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlmAirBusV3 {
	
	static Scanner sc = new Scanner(System.in);
	static List<ArrayList<String>> listDataPlanes = DataPlm.getDataPlanes();
	static List<ArrayList<String>> listAirCrafts = DataPlm.getAirCrafts();
	static int inputMenuChossen;
	
	public static void main(String[] args) {
		Utils.drawPlane();
			
		while(inputMenuChossen != 5) {
			Utils.displayMenu();
			while(!sc.hasNextInt()) sc.next();
			inputMenuChossen = sc.nextInt();
			
			switch (inputMenuChossen) {
			case 1:
				displayPlanes();
				break;
			case 2:
				displayPlanesByKeyWord();
				break;
			case 3:
				AirCraft.airCraftsManagement();
				break;
			case 4:
				displayDetailPlaneAirCrafts();
				break;
			case 5:
				inputMenuChossen = 5;
			default:
				break;
			}
		}
		System.err.println("Fin du programme a bientot");
	}

	
	/**
	 * Display list planes
	 */
	static public void displayPlanes() {
		for (int i = 0; i < listDataPlanes.size(); i++) {
			System.out.println(listDataPlanes.get(i));
		}
	}
	
	/**
	 * Display planes list by keyWord program
	 */
	static public void displayPlanesByKeyWord() {
		System.err.println("En attente d'un mot clé");
		String keyWord = Utils.verifIsEmptyInput("Merci d'écrire un mot clé");
		Utils.asciiWordResul();
		for (int i = 0; i < listDataPlanes.size(); i++) {
			if (listDataPlanes.get(i).get(0).toLowerCase().contains(keyWord.toLowerCase())) {
				System.out.println(listDataPlanes.get(i));
			}
		}
	}
	
	/**
	 * Select plane by index
	 * @param index
	 */
	static public ArrayList<String> selectPlaneByIndex(int index) {
		ArrayList<String> plane = new ArrayList<String>();
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - ");
		for (int i = 0; i < listDataPlanes.size(); i++) {
			if (i == index) 
			{
				System.out.println(listDataPlanes.get(i));
				plane = listDataPlanes.get(i);
			}
		}
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - ");
		return plane;
	}
	
	static public void displayDetailPlaneAirCrafts(){
		System.out.println("Saisissez l'id de l'avion");
		int inputUserIdPlane = Utils.verifIfIntArr2D("Saisissez l'id de l'avion", listDataPlanes);
		ArrayList<String> plane = selectPlaneByIndex(inputUserIdPlane);
		boolean isAirCraft = false;
		
		for (String airCraftname : plane) {
			isAirCraft = AirCraft.getAirCraftByName(airCraftname, listAirCrafts);
		}
		if(!isAirCraft) System.err.println("Pas de piece a afficher");
	}
}