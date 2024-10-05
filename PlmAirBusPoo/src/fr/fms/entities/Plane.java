package fr.fms.entities;

import java.util.ArrayList;
import java.util.List;

import fr.fms.entities.PlaneEnum.phase;
import fr.fms.entities.PlaneEnum.type;
import fr.fms.entities.PlaneEnum.program;

public class Plane {
 

	// init properties
	private long planeId;
	private program program;
	private phase currentPhase;
	private type planeType;
	private List<Aircraft> aircraftList = new ArrayList<Aircraft>();
	
	
	
	public Plane(long planeId, program program, phase currentPhase, type planeType, List<Aircraft> aircraftList) {
		this.planeId = planeId;
		this.program = program;
		this.currentPhase = currentPhase;
		this.planeType = planeType;
		this.aircraftList = aircraftList;
	}
	
	
	public Plane(long planeId, program program, phase currentPhase, type planeType) {
		this.planeId = planeId;
		this.program = program;
		this.currentPhase = currentPhase;
		this.planeType = planeType;
	}
	

	@Override
	public String toString() {
		return "[planeId=" + planeId + ", program=" + program + ", currentPhase=" + currentPhase + ", planeType="
				+ planeType + " aircrafftList= " + aircraftList+ "]";
	}
	
	

	public List<Aircraft> getAircraftList() {
		return aircraftList;
	}


	public void setAircraftList(Aircraft aircraf) {
		this.aircraftList.add(aircraf);
	}


	public long getPlaneId() {
		return planeId;
	}


	public void setPlaneId(long planeId) {
		this.planeId = planeId;
	}


	public program getProgram() {
		return program;
	}



	public void setProgram(program program) {
		this.program = program;
	}


	public phase getCurrentPhase() {
		return currentPhase;
	}


	public void setCurrentPhase(phase currentPhase) {
		this.currentPhase = currentPhase;
	}


	public type getPlaneType() {
		return planeType;
	}


	public void setPlaneType(type planeType) {
		this.planeType = planeType;
	}
	
}
