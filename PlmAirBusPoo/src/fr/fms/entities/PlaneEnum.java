package fr.fms.entities;

public class PlaneEnum {
	
	// init enum constant
	
		// phase
	private final String feasibilityStudy = "étude de faisabilité";
	private final String conception = "conception";
	private final String definition = "definition";
	private final String build = "construction";
	private final String inService = "en service";
	private final String closed = "clôturé";
	
		// type
	private final String fret = "Fret";
	private final String passengerTransport = "transport passager";
	private final String military = "militaire";
	private final String buisness = "avions d’affaires";
	
		// program
	private final String a320 = "A320";
	private final String a400m = "A400M";
	private final String a380 = "A380";
	private final String A300 = "A300";
	
	// init enum
	public enum phase {feasibilityStudy, conception, definition, build, inService, closed};
	public enum type {fret, passengerTransport, military, buisness}
	public enum program {a320, a400m, a380, a300};

}
