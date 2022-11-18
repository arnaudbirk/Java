package Exo_State;

public class StopState extends MusicPlayerState {

	public StopState() {
		super("stop");
	}

	@Override
	public void doAction() {
		System.out.println("Et je stop tout...");	
	}

	public boolean isNextStateCompatible(MusicPlayerState nextState) {
		if (nextState instanceof PauseState)
			return false;
		return true;
	}
	
}
