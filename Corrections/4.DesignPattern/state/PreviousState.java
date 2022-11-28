public class PreviousState extends MusicPlayerState{

	public PreviousState() {
		super("précedent");
	}

	@Override
	public void doAction(MusicPlayer p) {
		p.setCurrentMusic(p.getCurrentMusic()-1);
		System.out.println("Je passe à la musique précdente : "+p.getCurrentMusic());
		
		
	}
}