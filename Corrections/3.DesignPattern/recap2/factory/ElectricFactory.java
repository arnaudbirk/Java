package factory;

import model.Car;
import model.Scooter;

public class ElectricFactory extends AbstractFactory{
	private static ElectricFactory instance;
	
	private ElectricFactory() {}
	
	public static ElectricFactory getInstance() {
		if(instance == null) {
			instance =  new ElectricFactory();
		}
		return instance;
	}

	@Override
	public Car createCar(String name, int prix) {
		return new Car(name, "Electric", prix);
	}

	@Override
	public Scooter createScooter(String name, int prix) {
		return new Scooter(name, "Electric", prix);
	}
}
