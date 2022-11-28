package Exo_State;

public class PreviusState extends MusicPlayerState {

	public PreviusState() {
		super("previus");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction(MusicPlayer player) {
		
		if (player.getState() instanceof StopState) {
			System.out.println("Deja arrete... rien à faire");
			return;
		}
		
		int curentPiste = player.getPiste();
		int previus = (curentPiste > 0 ? curentPiste-1 : 0);
		player.setPiste( previus );
		System.out.println("Piste  " + player.getPiste());
	}

}
