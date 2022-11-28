package Exo_State;

public abstract class MusicPlayerState {

	private String name;
	
	public MusicPlayerState(String name) {
		this.name = name;
	}
	
	public abstract void doAction(MusicPlayer player);
	
	public String getName() {
		return name;
	}
	
}
