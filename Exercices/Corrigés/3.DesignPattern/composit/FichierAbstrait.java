package Exo_Composit;

public abstract class FichierAbstrait {

	protected String nom;
	
	FichierAbstrait(String nom){
		this.nom = nom;
	}
	
	abstract void afficher(); 
	
	public String getNom() {
		return nom;
	}
	
}
