package model;
public class CarWithGPS extends CarWithOption{
	
	public final static int prix_option = 500;
		
	public CarWithGPS(Car car){
		super(car.getName(), car.getType(), car, prix_option, car.getPrix());
	}

	@Override
	public String toString(){
		return this.getCar().toString() + " \n OPTION : GPS (" + this.getSup() + " euros)";

	}

}
