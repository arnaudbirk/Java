package Exo_State;

public class PauseState extends MusicPlayerState {

	PauseState(){
		super("pause");
	}
		
	@Override
	public void doAction(MusicPlayer player) {
		
		if (player.getState() instanceof StopState) {
			System.out.println("Deja arrete... rien à faire");
			return;
		}
		
		player.setState(this);
		System.out.println("Et je coupe le son !");	
	}

}
