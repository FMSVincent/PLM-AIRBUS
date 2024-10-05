package fr.fms.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import fr.fms.entities.PlaneEnum.phase;
import fr.fms.entities.PlaneEnum.program;
import fr.fms.entities.PlaneEnum.type;
import fr.fms.entities.Wheel;
import fr.fms.entities.Wing;
import fr.fms.entities.Aircraft;
import fr.fms.entities.Categorie;
import fr.fms.entities.Plane;

public class Data {
	
	private static Map<Integer, Plane> planesList = new HashMap<Integer, Plane>();
	
	// plane // 
	public static Map<Integer, Plane> getDataPlane() {

		planesList.put(1, new Plane(548, program.a380, phase.build, type.buisness));
		planesList.put(2, new Plane(4578, program.a300, phase.conception, type.military));
		planesList.put(3, new Plane(4555, program.a400m, phase.definition, type.passengerTransport));
		planesList.put(4, new Plane(6989, program.a320, phase.closed, type.buisness));
		planesList.put(5, new Plane(1547, program.a300, phase.feasibilityStudy, type.fret));
		
		return planesList;
	}
	
	
	/////////////// Aircraft //////////////////
	
	public static Categorie getDataCategorieWheel(){
		
		Aircraft littleWheel = new Wheel(1, "petite roue", 100);
		Aircraft bigWheel = new Wheel(2, "grande roue", 200);
		Categorie wheels = new Categorie(1, "Roues");
		wheels.setListPieces(bigWheel);
		wheels.setListPieces(littleWheel);
		
		return wheels;
	}
	
	public static Categorie getDataCategorieWing(){
		
		Aircraft littleWing = new Wing(1, "petite aile", 100);
		Aircraft bigWing = new Wing(2, "grande aile", 200);
		Categorie wings = new Categorie(1, "Ailes");
		wings.setListPieces(bigWing);
		wings.setListPieces(littleWing);
		
		return wings;
	}

}
