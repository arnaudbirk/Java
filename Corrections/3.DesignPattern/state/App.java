package Exo_State;

public class App {

	public static void main(String[] args) {
		
		System.out.println("----- Begin test -----" + '\n');

		MusicPlayer player = new MusicPlayer("my_player");
		
		PlayState play = new PlayState();
		PauseState pause = new PauseState();
		StopState stop = new StopState();
		NextState next = new NextState();		
		PreviusState previus = new PreviusState();
		
		//play.doAction(player);
		//pause.doAction(player);
		stop.doAction(player);
		play.doAction(player);
		next.doAction(player);
		previus.doAction(player);
		next.doAction(player);
		next.doAction(player);
		next.doAction(player);
		next.doAction(player);
		previus.doAction(player);
		stop.doAction(player);
		previus.doAction(player);
		previus.doAction(player);
		previus.doAction(player);
		stop.doAction(player);
		previus.doAction(player);
		previus.doAction(player);

		System.out.println('\n' + "----- End test -----");
	}

}
