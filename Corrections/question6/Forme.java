package question6;

public abstract class Forme {
	
	private String nom;
	static private int compteur;

	// code générique - préférable à l'appel dans le constructeur.
	{
		compteur++;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public abstract double surface();
	
	static public int getCompteur() {
		return compteur;
	}
}
