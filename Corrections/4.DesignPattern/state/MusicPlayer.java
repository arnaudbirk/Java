public class MusicPlayer {

	private String nom;
	private MusicPlayerState state;
	
	private int currentMusic;

	public MusicPlayer(String nom) {
		this.nom = nom;
		this.currentMusic=0;
		state = new StopState();
	}
	
	public String getNom() {
		return nom;
	}

	public void setState(MusicPlayerState state) {
		if (this.state.isNextStateCompatible(state)) {
			this.state = state;
			this.state.doAction(this);
		}
		else 
			System.out.println("L'action suivante n'est pas compatible avec l'etat en cours : on ne fait rien.");
	}
	
	public int getCurrentMusic() {
		return currentMusic;
	}

	public void setCurrentMusic(int currentMusic) {
		this.currentMusic = currentMusic;
	}

}
