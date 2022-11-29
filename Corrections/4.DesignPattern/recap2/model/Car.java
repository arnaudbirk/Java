package model;

import factory.AbstractFactory;

public class Car{
	
	private String name;
	private String type;
	private int prix;

	public Car(String name, String type, int prix) {
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
		return "Voiture : "+this.name+", type : "+this.type+", Prix de base : "+this.getPrix();
	}
}
