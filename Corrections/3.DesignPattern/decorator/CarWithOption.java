public abstract class CarWithOption extends Car{
	
	/**
	 * Encapsulation d'un objet Car
	 * Comme CarWithOption hérite de Car, on peut créer récursivement des voitures avec plusieurs options
	 */
	private Car car;
	/**
	 * Prix de l'option ajoutée
	 */
	private int sup; // prix de l'option


	public CarWithOption(Car car, int sup) {
		super();
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
