package model;
public class CarWithSunRoof extends CarWithOption{
	
	public final static int prix_option = 1000;
		
	public CarWithSunRoof(Car car){
		super(car.getName(), car.getType(), car, prix_option, car.getPrix());
	}

	@Override
	public String toString() {
		return this.getCar().toString() + " \n OPTION : Toit ouvrant (" + this.getSup() + " euros)";
	}


}
