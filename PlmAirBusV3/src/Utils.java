import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

	static Scanner sc = new Scanner(System.in);
	
	static String[] menuMain = {"1 - Afficher tous les avions", 
			"2 - Afficher tous les avions contenant un mot clé dans le programme", 
			"3 - Ajouter ou supprimer une piece pour un avion donné",
			"4 - Afficher un avion avec les infos détaillées de chaque pieces", 
			"5 - Quitter"};
	
	static String[] menuAirCrafts = {"1 - Afficher toutes les piece dispo",
			"2 - Ajouter une piece",
			"3 - Supprimer une piece",
			"4 - Quitter"
	};
	
	static public Boolean containWithIgnoreCase(ArrayList<String> arr, String value) {
		for (String element : arr) {
			if (element.equalsIgnoreCase(value)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Verif if input user is a int else err message and ask again
	 * @param message
	 * @param arr simple
	 * @return int
	 */
	static public int verifIfInt(String message, ArrayList<String> arr) {
		while(!sc.hasNextInt()) {
			System.out.println("Doit etre un int");
			sc.next();
		}
		int inputUser = sc.nextInt();
		while (inputUser < 0 || inputUser > arr.size()-1) {
			System.err.println(message);
			System.out.println("En attente d'une entrée valide");
			while(!sc.hasNextInt()) sc.next();
			inputUser = sc.nextInt();
		}
		return inputUser;
	}
	
	
	/**
	 * Verif if input user is a int else err message and ask again
	 * @param arr[][]
	 * @param message error
	 * @return int
	 */
	static public int verifIfIntArr2D(String message, List<ArrayList<String>> arr) {
		while(!sc.hasNextInt()) {
			System.out.println("Doit etre un int");
			sc.next();
		}
		int inputUser = sc.nextInt();
		while (inputUser < 0 || inputUser > arr.size()-1) {
			System.err.println(message);
			System.out.println("En attente d'une entrée valide");
			while(!sc.hasNextInt()) sc.next();
			inputUser = sc.nextInt();
		}
		return inputUser;
	}
	
	/**
	 * Display menu aircrafts
	 */
	static public void displayAsciiAirCraftsMenu() {
		System.out.println("\r\n"
				+ "     _    _                     __ _       \r\n"
				+ "    / \\  (_)_ __ ___ _ __ __ _ / _| |_ ___ \r\n"
				+ "   / _ \\ | | '__/ __| '__/ _` | |_| __/ __|\r\n"
				+ "  / ___ \\| | | | (__| | | (_| |  _| |_\\__ \\\r\n"
				+ " /_/   \\_|_|_|  \\___|_|  \\__,_|_|  \\__|___/\r\n"
				+ "                                           \r\n"
				+ "");
		for (String title : menuAirCrafts) {
			System.out.println(title);
		}

		System.out.println("*****************************");
	}
	
	/**
	 * Display principal menu
	 */
	static void displayMenu() {
		System.out.println("*****************************");
		System.out.println("\r\n"
				+ " |  \\/  |                 \r\n"
				+ " | \\  / | ___ _ __  _   _ \r\n"
				+ " | |\\/| |/ _ \\ '_ \\| | | |\r\n"
				+ " | |  | |  __/ | | | |_| |\r\n"
				+ " |_|  |_|\\___|_| |_|\\__,_|\r\n");
		for (String title : menuMain) {
			System.out.println(title);
		}
		System.out.println("*****************************");
	}
	
	/**
	 * Control if inpuUser is empty if yes ask again
	 * @param inputUser
	 * @param sc scanner
	 * @return String inputser
	 */
	public static String verifIsEmptyInput(String message) {
		String inputUser = sc.nextLine();
		while(inputUser.isEmpty()) {
			System.err.println(message);
			inputUser = sc.nextLine();
		}
		return inputUser;
	}
	
	/**
	 * Display Word Resultats ascii format
	 */
	public static void asciiWordResul() {
		System.out.println("\r\n"
				+ "  ____                _ _        _           \r\n"
				+ " |  _ \\ ___ ___ _   _| | |_ __ _| |_ ___   _ \r\n"
				+ " | |_) / _ / __| | | | | __/ _` | __/ __| (_)\r\n"
				+ " |  _ |  __\\__ | |_| | | || (_| | |_\\__ \\  _ \r\n"
				+ " |_| \\_\\___|___/\\__,_|_|\\__\\__,_|\\__|___/ (_)\r\n"
				+ "                                             \r\n"
				+ "");
	}
	
	/**
	 * graph plane
	 */
	static public void drawPlane() {
		System.out.println("         -=\\`\\\r\n"
				+ "     |\\ ____\\_\\__\r\n"
				+ "   -=\\FMS-AirLine`\"\"`)\r\n"
				+ "      `~~~~~/ /~~`\r\n"
				+ "        -==/ /");
	}
}
