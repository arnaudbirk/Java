package Exo_Composit;

import java.util.Vector;

public class Dossier extends FichierAbstrait {

	private Vector<FichierAbstrait> mFichier = new Vector<FichierAbstrait>();
	
	Dossier(String nom){
		super(nom);
		
		//on devrait scanner les fichiers pour remplir le vecteur...
		
	}
	
	@Override
	void afficher() {
		System.out.println("Contenu dans le dossier " + this.nom);
		for (int i=0; i<mFichier.size(); i++)
			mFichier.get(i).afficher();
	}

	public void add(FichierAbstrait fichier) {
		mFichier.add(fichier);
	}
	
	public Vector<FichierAbstrait> getmFichier() {
		return mFichier;
	}

}
