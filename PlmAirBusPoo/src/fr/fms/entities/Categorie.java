package fr.fms.entities;

import java.util.ArrayList;
import java.util.List;

public class Categorie {

	private int categorieId;
	private String name;
	private List<Aircraft> listPieces = new ArrayList<Aircraft>();
	
	public Categorie(int categorieId, String name, List<Aircraft> listPieces) {
		this.categorieId = categorieId;
		this.name= name;
		this.listPieces = listPieces;
	}
	
	public Categorie(int categorieId, String name) {
		this.categorieId = categorieId;
		this.name= name;
	}

	@Override
	public String toString() {
		return "Categorie [categorieId=" + categorieId + ", listPieces=" + listPieces + "]";
	}

	public int getCategorieId() {
		return categorieId;
	}

	public void setCategorieId(int categorieId) {
		this.categorieId = categorieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Aircraft> getListPieces() {
		return listPieces;
	}

	public void setListPieces(Aircraft listPieces) {
		this.listPieces.add(listPieces);
	}
	
	
	
	
}
