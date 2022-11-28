public class StopState extends MusicPlayerState {

	public StopState() {
		super("stop");
	}

	@Override
	public void doAction(MusicPlayer p) {
		p.setCurrentMusic(0);
	}

	public boolean isNextStateCompatible(MusicPlayerState nextState) {
		if (nextState instanceof PauseState)
			return false;
		return true;
	}
	
}
