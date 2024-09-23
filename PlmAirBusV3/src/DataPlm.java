import java.util.ArrayList;
import java.util.List;

public class DataPlm {
	
	static List<ArrayList<String>> listDataPlanes = new ArrayList<ArrayList<String>>();
	static List<ArrayList<String>> listAirCrafts = new ArrayList<ArrayList<String>>();
	
	static public ArrayList<ArrayList<String>> getDataPlanes () {
		listDataPlanes.add(new ArrayList<String>() {{add("A400m");add("PLM_AIRBUS_DEFINITION");add("Cargo");}});
		listDataPlanes.add(new ArrayList<String>() {{add("A320");add("PLM_AIRBUS_IN_SERVICE");add("Passenger");}});
		listDataPlanes.add(new ArrayList<String>() {{add("A350");add("PLM_AIRBUS_FEASBILITY");add("Passenger");}});
		listDataPlanes.add(new ArrayList<String>() {{add("A380");add("PLM_AIRBUS_STOPPPED");add("Passenger");}});
		return (ArrayList<ArrayList<String>>) listDataPlanes;
	}
	
	static public ArrayList<ArrayList<String>> getAirCrafts(){
		listAirCrafts.add(new ArrayList<String>() {{add("Compas"); add("Navigation");add("5000");}});
		listAirCrafts.add(new ArrayList<String>() {{add("GPS"); add("Navigation");add("1000");}});
		return (ArrayList<ArrayList<String>>)  listAirCrafts;
	}

}
