package fr.fms.main;

import java.util.Map;
import java.util.Scanner;

import fr.fms.data.Data;
import fr.fms.entities.Categorie;
import fr.fms.entities.Plane;
import fr.fms.job.AirBusImplJob;

public class StartApp {

	private static Map<Integer, Plane> planeList = Data.getDataPlane();
	private static Categorie wheels = Data.getDataCategorieWheel();
	private static Categorie wings = Data.getDataCategorieWing();
	private static String[] categoriesNames = {"1 - Roues", "2 - Ailes"};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AirBusImplJob airbusJob = new AirBusImplJob();
		
		// display all plane
		airbusJob.displayPlanes(planeList);
		
		// display By Key word
		//airbusJob.getPlanesByKeyWord("a3", planeList);
		
		// achat de piece
		System.out.println("Entrer id de l'avion pour l'achat de piece");
		long inputId = sc.nextLong();
		Plane planeSelected = airbusJob.getPlaneById(planeList, inputId);
		
		System.out.println("Selectionnez la categorie");
		for (String categorie : categoriesNames) {
			System.out.println(categorie);
		}
		int inputCategorieSelected = sc.nextInt();
		if (inputCategorieSelected == 1) {
			airbusJob.displayPiecesByCategorie(wheels);
			System.out.println("Entrer id de la piece");
			int idPieceBought = sc.nextInt();
			airbusJob.buyPiece(planeSelected, idPieceBought, wheels);
		}
		else if (inputCategorieSelected == 2) {
			airbusJob.displayPiecesByCategorie(wings);
			System.out.println("Entrer id de la piece");
			int idPieceBought = sc.nextInt();
			airbusJob.buyPiece(planeSelected, idPieceBought, wings);
		}
		else System.err.println("Entrer invalide");
		sc.nextLine();

		sc.close();
	}
	
	
	
}
