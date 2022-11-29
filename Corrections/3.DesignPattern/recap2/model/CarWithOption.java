package model;

import factory.AbstractFactory;

public abstract class CarWithOption extends Car{
	
	private Car car;

	private int sup; // prix de l'option


	public CarWithOption(Car car, int sup) {
		super(car.getName(), car.getType(), car.getPrix());
		this.car = car;
		this.sup = sup;
	}

	@Override
	public int getPrix(){
		int p = this.getCar().getPrix() + this.getSup();
		return p;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	public int getSup() {
		return sup;
	}

	public void setSup(int sup) {
		this.sup = sup;
	}

}
