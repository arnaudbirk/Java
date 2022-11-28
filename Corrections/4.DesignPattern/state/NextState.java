public class NextState extends MusicPlayerState{

	public NextState() {
		super("suivant");
	}

	@Override
	public void doAction(MusicPlayer p) {
		p.setCurrentMusic(p.getCurrentMusic()+1);
		System.out.println("Je passe à la musique suivante : "+p.getCurrentMusic());
	}
}
