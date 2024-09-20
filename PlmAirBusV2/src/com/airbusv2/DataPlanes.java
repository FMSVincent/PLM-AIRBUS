package com.airbusv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataPlanes {
	static Map<String, ArrayList<ArrayList<String>>> planesList = new HashMap<>();
	static Map<String, ArrayList<ArrayList<String>>> airCrafts = new HashMap<>();
	
	// init planes and return data
	static public Map<String, ArrayList<ArrayList<String>>> getDataPlanes(){
	    planesList.put("Program: A300", new ArrayList<ArrayList<String>>() {{
	        add(new ArrayList<String>() {{ add("ID: 54784ef"); add("Phase: définition"); add("Type: avions d’affaires"); add("Ailes");add("Turbo");add("Roue");add("Cable");}});
	        add(new ArrayList<String>() {{ add("ID: 54741ef"); add("Phase: définition"); add("Type: Fret");  add("Ailes");add("Turbo");add("Roue");add("Cable");}});
	    }});
	    planesList.put("Program: A320", new ArrayList<ArrayList<String>>() {{
	        add(new ArrayList<String>() {{ add("ID: 54484ef"); add("Phase: définition"); add("Type: passager");  add("Ailes");add("Turbo");add("Roue");add("Cable");}});
	        add(new ArrayList<String>() {{ add("ID: 54884ef"); add("Phase: construction"); add("Type: Militaire"); add("Ailes");add("Turbo");add("Roue");add("Cable"); }});
	    }});
	    planesList.put("Program: A350", new ArrayList<ArrayList<String>>() {{
	        add(new ArrayList<String>() {{ add("ID: 54494ef"); add("Phase: en service"); add("Type: passager");  add("Ailes");add("Turbo");add("Roue");add("Cable");}});
	        add(new ArrayList<String>() {{ add("ID: 54884ef"); add("Phase: construction"); add("Type: clôturé");  add("Ailes");add("Turbo");add("Roue");add("Cable");}});
	    }});
	    
	    return planesList;
	}
	  

	static public Map<String, ArrayList<ArrayList<String>>> getDataAirCrafts(){
		
	    // init aircraft
	    airCrafts.put("Ailes", new ArrayList<ArrayList<String>>() {{
	        add(new ArrayList<String>() {{ add("prix: 88£"); add("grande aile droite"); }});
	        add(new ArrayList<String>() {{ add("prix: 108£"); add("petite aile"); }});
	    }});
	    airCrafts.put("Roues", new ArrayList<ArrayList<String>>() {{
	        add(new ArrayList<String>() {{ add("prix: 150£"); add("grande roue"); }});
	        add(new ArrayList<String>() {{ add("prix: 108£"); add("petite roue"); }});
	    }});
	    
	    return airCrafts;
	}



}
