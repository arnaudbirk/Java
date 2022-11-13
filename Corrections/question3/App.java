package question3;

import question1.Carre;
import question2.Cube;

public class App {

	public static void main(String[] args) {
		Carre r1 = new Carre(10);
		Carre r2 = new Carre(10, 10, 20);
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		
		Cube c = new Cube(10,10,10,20);
		
		System.out.println(c.toString());
	}
}
