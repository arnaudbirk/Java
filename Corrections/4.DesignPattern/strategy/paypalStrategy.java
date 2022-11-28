public class paypalStrategy extends payementStrategy {

	private String id;
	private String password;
	
	paypalStrategy(String id, String password){
		this.id = id;
		this.password = password;
	}
	
	@Override
	public void payer(int prix) {
		System.out.println("je paye " + prix + " avec paypal");
	}

	public String getPassword() {
		return password;
	}

	public String getId() {
		return id;
	}	
	
}
