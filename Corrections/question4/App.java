package question4;

import question4.Carre;
import question4.Cube;

public class App {

	public static void main(String[] args) {
		System.out.println("Test pour le carre");
		Carre r = new Carre(10);
		System.out.println(r.toString());
		r.increase(2);
		System.out.println(r.toString());
		r.decrease(5);
		System.out.println(r.toString());
		
		System.out.println("Test pour le cube");
		Cube c = new Cube(0,0,0,20);
		System.out.println(c.toString());
		c.increase(2);
		System.out.println(c.toString());
		c.decrease(5);
		System.out.println(c.toString());
		
		System.out.println("Test pour le cercle");
		Cercle cercle = new Cercle(10);
		System.out.println(cercle.toString());
		cercle.increase(2);
		System.out.println(cercle.toString());
		cercle.decrease(4);
		System.out.println(cercle.toString());
		
		System.out.println("Test pour la sphere");
		Sphere s = new Sphere(0,0,0,20);
		System.out.println(s.toString());
		s.increase(4);
		System.out.println(s.toString());
		s.decrease(2);
		System.out.println(s.toString());
	}
}
