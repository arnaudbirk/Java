public class App {

	public static void main(String[] args) {

		System.out.println("----- Begin test -----" + '\n');

		Article article1 = new Article("Livre : 'Tout savoir sur le pattern Strategy'",25);
		Article article2 = new Article("Piano steinway & sons d274",155690);

		paypalStrategy paypal = new paypalStrategy("idExemple", "passwordExemple");
		article1.payer(paypal);

		CBStrategy CB = new CBStrategy( "1234567890123456", "786", "12/15");
		article2.payer(CB);

		System.out.println('\n' + "----- End test -----");
	}

}
