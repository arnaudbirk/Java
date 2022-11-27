public class App {

	public static void main(String[] args) {
		Car baseCar = new Car();
		System.out.println(baseCar.toString());
		
		Car carWithGPS = new CarWithGPS(baseCar);
		System.out.println(carWithGPS.toString());
		
		Car carWithSunRoof = new CarWithSunRoof(baseCar);
		System.out.println(carWithSunRoof.toString());
		
		Car carFullOption = new CarWithGPS(baseCar);
		carFullOption = new CarWithSunRoof(carFullOption);
		System.out.println(carFullOption);

	}

}
