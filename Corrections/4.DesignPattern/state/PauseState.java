public class PauseState extends MusicPlayerState {

	PauseState(){
		super("pause");
	}
		
	@Override
	public void doAction(MusicPlayer p) {
		System.out.println("Et je coupe le son !");
	}
}
