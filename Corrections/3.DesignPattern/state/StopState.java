package Exo_State;

public class StopState extends MusicPlayerState {

	public StopState() {
		super("stop");
	}

	@Override
	public void doAction(MusicPlayer player) {
		player.setState(this);
		player.setPiste(0);
		System.out.println("Et je stop tout...");	
	}

	public boolean isNextStateCompatible(MusicPlayerState nextState) {
		if (nextState instanceof PauseState)
			return false;
		if (nextState instanceof NextState)
			return false;
		if (nextState instanceof PreviusState)
			return false;
		return true;
	}
	
}
