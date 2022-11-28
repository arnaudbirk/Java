public class PlayState extends MusicPlayerState {

	public PlayState() {
		super("play");
	}

	@Override
	public void doAction(MusicPlayer p) {
		System.out.println("Et je met le son !");	
	}


}
