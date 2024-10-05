package fr.fms.job;

import java.util.Map;

import fr.fms.entities.Categorie;
import fr.fms.entities.Plane;

public interface AirusIJob {
	
	void displayPlanes(Map<Integer, Plane> planeList);
	void getPlanesByKeyWord(String keyWord,  Map<Integer, Plane> planeList);
	void displayPiecesByCategorie(Categorie pieces);
	Plane getPlaneById(Map<Integer, Plane> planeList, long planeId);
	void buyPiece(Plane plane, int pieceId, Categorie categorie);
	
}
