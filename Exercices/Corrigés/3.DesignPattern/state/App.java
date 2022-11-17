package Exo_State;

public class App {

	public static void main(String[] args) {
		
		System.out.println("----- Begin test -----" + '\n');

		MusicPlayer player = new MusicPlayer("my_player");
		
		PlayState play = new PlayState();
		PauseState pause = new PauseState();
		StopState stop = new StopState();
		
		player.setState(play);
		player.setState(play);
		player.setState(pause);
		player.setState(stop);
		player.setState(play);
		player.setState(stop);
		player.setState(pause);

		System.out.println('\n' + "----- End test -----");
	}

}
