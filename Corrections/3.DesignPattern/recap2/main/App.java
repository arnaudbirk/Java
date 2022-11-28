package main;
import factory.AbstractFactory;
import model.Car;
import model.CarWithGPS;
import model.CarWithSunRoof;

public class App {

	public static void main(String[] args) {
		System.out.println("***************** Fabrique *****************");
		System.out.println();
		
		AbstractFactory factory = AbstractFactory.getElectricFactory();
		System.out.println(factory.createCar("ZoE", 25000).toString());
		System.out.println(factory.createScooter("Rider", 8000).toString());
		
		factory = AbstractFactory.getGasolineFactory();
		System.out.println(factory.createCar("Hummer", 100000).toString());
		System.out.println(factory.createScooter("Tmax", 5000));
		
		System.out.println();
		System.out.println("***************** Decorator *****************");
		System.out.println();
		
		Car baseCar = factory.createCar("Megane", 30000);
		System.out.println(baseCar.toString());
		
		Car carWithGPS = new CarWithGPS(baseCar);
		System.out.println();
		System.out.println(carWithGPS.toString());
		
		Car carWithSunRoof = new CarWithSunRoof(baseCar);
		System.out.println();
		System.out.println(carWithSunRoof.toString());
		
		Car carFullOption = new CarWithGPS(baseCar);
		carFullOption = new CarWithSunRoof(carFullOption);
		System.out.println();
		System.out.println(carFullOption);
	}
}
