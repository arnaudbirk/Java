package Exo_State;

public class MusicPlayer {

	private String nom;
	private MusicPlayerState state;
	
	public MusicPlayer(String nom) {
		this.nom = nom;
		state = new StopState();
	}
	
	public String getNom() {
		return nom;
	}

	public void setState(MusicPlayerState state) {
		if (this.state.isNextStateCompatible(state)) {
			this.state = state;
			this.state.doAction();
		}
		else 
			System.out.println("L'action suivante n'est pas compatible avec l'etat en cours : on ne fait rien.");
	}

}
