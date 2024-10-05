package fr.fms.job;

import java.util.Map;

import fr.fms.entities.Aircraft;
import fr.fms.entities.Categorie;
import fr.fms.entities.Plane;

public class AirBusImplJob implements AirusIJob {
	
	////////////////////////////PLANE////////////////////////////
	
	public void displayPlanes(Map<Integer, Plane> planeList) {

		planeList.entrySet().stream().forEach(
				entry -> System.out.println(entry.getKey()+ " " + entry.getValue())
				);
	}
	
	public void getPlanesByKeyWord(String keyWord, Map<Integer, Plane> planeList) {
		planeList.entrySet().stream().forEach(entry -> {
			if (entry.getValue().getProgram().toString().toLowerCase().contains(keyWord)) {
				System.out.println(entry.getValue());
			}
		});
	}
	
	public Plane getPlaneById(Map<Integer, Plane> planeList, long planeId) {
		return planeList.values().stream().filter(plane -> plane.getPlaneId() == planeId).findFirst().orElse(null);
	}

	////////////////////////////AIRCRAFT////////////////////////////
	
	public void displayPiecesByCategorie(Categorie pieces){
		System.out.println("---------- "+pieces.getName()+" ----------");
		for (Aircraft aircraft : pieces.getListPieces()) {
			System.out.println(aircraft);
		}	
	}
	
	public void buyPiece(Plane plane, int pieceId, Categorie categorie) {
		Aircraft aircraft = categorie.getListPieces().stream().filter(id -> id.getAircraftId() == pieceId).findFirst().orElse(null);
		aircraft.setCategorie(categorie.getName());
		System.out.println(aircraft);
		plane.setAircraftList(aircraft);
		System.out.println(plane);
	}
	
}
