public class Car{
	
	private final static int prix = 30000;

	public Car() {
	}
	
	public int getPrix() {
		return prix;
	}
	
	@Override
	public String toString() {
		return "Prix de base : "+this.getPrix();
	}
}
