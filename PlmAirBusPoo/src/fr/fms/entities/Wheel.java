package fr.fms.entities;

public class Wheel extends Aircraft {
	
	private String categorie;

	public Wheel(int aircraftId, String name, int price, String categorie) {
		super(aircraftId, name, price, categorie);
	}
	
	public Wheel(int aircraftId, String name, int price) {
		super(aircraftId, name, price);
		this.categorie = "Roues";
	}

	@Override
	public String toString() {
		return "[ID=" + getAircraftId() + ", Name=" + getName() + ", Price=" + getPrice()
				+ ", Categorie=" + getCategorie() + "]";
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	

}
