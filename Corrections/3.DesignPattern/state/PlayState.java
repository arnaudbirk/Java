package Exo_State;

public class PlayState extends MusicPlayerState {

	public PlayState() {
		super("play");
	}

	@Override
	public void doAction() {
		System.out.println("Et je met le son !");	
	}


}
