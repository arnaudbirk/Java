public class CBStrategy extends payementStrategy {

	private String numeroCarte;
	private String crypto;
	private String dateExpiration;
	
	CBStrategy(String numeroCarte, String crypto, String dateExpiration){
		this.numeroCarte = numeroCarte;
		this.crypto = crypto;
		this.dateExpiration = dateExpiration;
	}
	
	@Override
	public void payer(int prix) {
		System.out.println("je paye " + prix + " avec ma carte de crédit.");
	}

	public String getNumeroCarte() {
		return numeroCarte;
	}

	public String getCrypto() {
		return crypto;
	}

	public String getDateExpiration() {
		return dateExpiration;
	}

}
