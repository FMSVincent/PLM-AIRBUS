package fr.fms.entities;

public class Wheel extends Aircraft {

	public Wheel(int aircraftId, String name, int price, String categorie) {
		super(aircraftId, name, price, categorie);
	}
	
	public Wheel(int aircraftId, String name, int price) {
		super(aircraftId, name, price);
	}

	@Override
	public String toString() {
		return "[ID=" + getAircraftId() + ", Name=" + getName() + ", Price=" + getPrice()
				+ ", Categorie=" + getCategorie() + "]";
	}

}
