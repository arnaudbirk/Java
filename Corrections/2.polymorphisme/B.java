package Exo_polymorphisme;

class B extends A {
	protected int b = 6;

	public B(int b) {
		super(2 * b);
		this.a = b;
	}

	@Override
	public void afficherClasse() {
		System.out.println("Classe B");
	}

	@Override
	public void afficherVariables() {
		super.afficherVariables();
		System.out.println("b = " + this.b);
	}
}
