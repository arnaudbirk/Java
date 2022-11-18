package Exo_Composit;

public class App {

	public static void main(String[] args) {

		System.out.println("----- Begin test -----" + '\n');

		Fichier fic = new Fichier("/Tmp/tmp.txt");
		fic.afficher();
		
		Dossier dos = new Dossier("/Tmp");
		dos.add(fic);
		dos.add(new Fichier("/tmp/tmp2.txt"));
		dos.afficher();
		
		System.out.println('\n');
		
		Dossier dos2 = new Dossier("/Tmp2");
		dos2.add(new Fichier("/tmp/tmp22.txt"));
		dos.add(dos2);
		dos.afficher();

		
		//que se passe-t-il qd l'on fait ça ?
		//dos.add(dos);
		//dos.afficher();
		
		System.out.println('\n' + "----- End test -----");
	}

}
