package Exo_polymorphisme;

public class A {
	
	protected int a = 5;

	public A(int a) {
		this.a = a;
	}

	public void afficherClasse() {
		System.out.println("Classe A");
	}

	public void afficherVariables() {
		System.out.println("a = " + this.a);
	}

}
