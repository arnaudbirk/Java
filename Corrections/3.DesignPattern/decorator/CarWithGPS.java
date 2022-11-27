public class CarWithGPS extends CarWithOption{
	
	public final static int prix_option = 500;
		
	public CarWithGPS(Car car){
		super(car, prix_option);
	}

	@Override
	public String toString(){
		return this.getCar().toString() + " \n OPTION : GPS (" + this.getSup() + " euros)";

	}

}
