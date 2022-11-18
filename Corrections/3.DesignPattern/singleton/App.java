package Exo_singleton;

public class App {

	public static void main(String[] args) {
		
		System.out.println("----- Begin test -----" + '\n');
		
		CompteBancaire cpt1 = new CompteBancaire(12);
		cpt1.depose(1233);
		cpt1.retire(300);
		
		CompteBancaire cpt2 = new CompteBancaire(13);
		cpt2.depose(123);
		cpt1.retire(300);
		
		System.out.println(Journalisation.getInstance().getLog());
		
		System.out.println("----- End test -----");
	}

}
