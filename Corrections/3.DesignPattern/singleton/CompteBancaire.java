package Exo_singleton;

public class CompteBancaire {

	private double solde;
	private int numero;

	// --- constructor with number --- //
	public CompteBancaire(int numero){
		this.numero = numero;
		this.solde = 0.;
	}

	// --- functions --- //

	public void depose(final double dep) {
		assert dep > 0;
		solde += dep; 
		Journalisation.getInstance().addLog("ajout de " + dep + " au compte " + this.numero + ". Nouveau solde : " + this.solde);
	}
	  
	public void retire(final double ret) {
		assert ret > 0;
		assert solde - ret > 0;
		solde -= ret; 
		Journalisation.getInstance().addLog("retrait de " + ret + " au compte " + this.numero + ". Nouveau solde : " + this.solde);
	}

	// --- getter and setter --- //
	
	public double getSolde() {
		Journalisation.getInstance().addLog("Nouveau solde de " + this.numero + " : " + this.solde);
		return solde;
	}

	public int getNumero() {
		return numero;
	}
	
}
