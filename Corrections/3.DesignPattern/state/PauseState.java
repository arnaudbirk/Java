package Exo_State;

public class PauseState extends MusicPlayerState {

	PauseState(){
		super("pause");
	}
		
	@Override
	public void doAction() {
		System.out.println("Et je coupe le son !");	
	}

}
