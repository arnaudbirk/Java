package Exo_State;

public class MusicPlayer {

	private String nom;
	private MusicPlayerState state;
	private int piste;
	
	public MusicPlayer(String nom) {
		this.nom = nom;
		state = new StopState();
		piste = 0;
	}
	
	public String getNom() {
		return nom;
	}

	public MusicPlayerState getState() {
		return this.state;
	}
	
	public void setState(MusicPlayerState state) {
		this.state = state;
	}

	public int getPiste() {
		return piste;
	}

	public void setPiste(int piste) {
		this.piste = piste;
	}

}
