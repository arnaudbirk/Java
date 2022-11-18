package Exo_Composit;

public class Fichier extends FichierAbstrait {

	Fichier(String nom){
		super(nom);
	}
	
	@Override
	void afficher() {
		System.out.println("fichier " + this.nom);
	}

}
