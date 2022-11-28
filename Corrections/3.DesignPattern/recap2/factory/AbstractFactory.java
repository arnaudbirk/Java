package factory;
import model.Car;
import model.Scooter;

public abstract class AbstractFactory {
	
	public static ElectricFactory getElectricFactory() {
		return ElectricFactory.getInstance();
	}
	
	public static GasolineFactory getGasolineFactory() {
		return GasolineFactory.getInstance();
	}

	public abstract Car createCar(String name, int prix);
	public abstract Scooter createScooter(String name, int prix);
	
}
