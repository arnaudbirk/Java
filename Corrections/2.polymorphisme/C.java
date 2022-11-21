package Exo_polymorphisme;

class C extends B {
	
	protected int b = 7;
	protected int c = 8;

	public C(int c) {
		super(3 * c);
		this.b = c;
	}

	@Override
	public void afficherClasse() {
		System.out.println("Classe C");
	}

	@Override
	public void afficherVariables() {
		super.afficherVariables();
		System.out.println("c = " + this.c);
	}
	
}
