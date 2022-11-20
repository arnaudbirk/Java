package Exo_State;

public abstract class MusicPlayerState {

	private String name;
	
	public MusicPlayerState(String name) {
		this.name = name;
	}
	
	public abstract void doAction();
	
	public String getName() {
		return name;
	}

	public boolean isNextStateCompatible(MusicPlayerState nextState) {
		return true;
	}
	
}
