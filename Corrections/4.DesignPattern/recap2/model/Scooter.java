package model;

import factory.AbstractFactory;

public class Scooter{
	
	private String name;
	private String type;
	private int prix;

	public Scooter(String name, String type, int prix) {
		this.name = name;
		this.type = type;
		this.prix = prix;
	}
	
	public int getPrix() {
		return prix;
	}
	
	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Scooter : "+this.name+", type : "+type+", Prix de base : "+this.getPrix();
	}
}
