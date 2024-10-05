package fr.fms.entities;

public abstract class Aircraft {
	
	private int aircraftId;
	private String name;
	private int price;
	private String categorie;
	
	
	public Aircraft(int aircraftId, String name, int price, String categorie) {
		this.aircraftId = aircraftId;
		this.name = name;
		this.price = price;
		this.categorie = categorie;
	}
	
	public Aircraft(int aircraftId, String name, int price) {
		this.aircraftId = aircraftId;
		this.name = name;
		this.price = price;
	}
	
	

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public int getAircraftId() {
		return aircraftId;
	}


	public void setAircraftId(int aircraftId) {
		this.aircraftId = aircraftId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
}
