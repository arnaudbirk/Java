package Exo_State;

public class NextState extends MusicPlayerState{

	public NextState() {
		super("next");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction(MusicPlayer player) {
		
		if (player.getState() instanceof StopState) {
			System.out.println("Deja arrete... rien à faire");
			return;
		}

		player.setPiste( player.getPiste() + 1 );
		System.out.println("Piste  " + player.getPiste());
	}

}
