package factory;

import model.Car;
import model.Scooter;

public class GasolineFactory extends AbstractFactory{
	private static GasolineFactory instance;
	
	private GasolineFactory() {}
	
	public static GasolineFactory getInstance() {
		if(instance == null) {
			instance =  new GasolineFactory();
		}
		return instance;
	}

	@Override
	public Car createCar(String name, int prix) {
		return new Car(name, "Gasoline", prix);
	}

	@Override
	public Scooter createScooter(String name, int prix) {
		return new Scooter(name, "Gasoline", prix);
	}

}
