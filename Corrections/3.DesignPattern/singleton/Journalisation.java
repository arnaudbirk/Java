package Exo_singleton;

public class Journalisation {

	private String log;
	private static Journalisation journal;
	
	// --- log functions --- //
	public String getLog() {
		return log;
	}
	
	public void addLog(String log) {
		this.log += log + '\n';
	}
	
	// --- private constructor  --- //
	private Journalisation() {
		log = "";	
	}
	
	public static Journalisation getInstance() {
		if (journal == null) {
			journal = new Journalisation();
		}
		return journal;
	}
	
	
}
