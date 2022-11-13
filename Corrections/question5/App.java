package question5;

public class App {

	public static void main(String[] args) {
		Carre r = new Carre(10);
		r.setNom("Mon Carre");
		System.out.println(r.toString());
		
		Cube c = new Cube(0,0,0,20);
		c.setNom("Mon cube");
		System.out.println(c.toString());
		
		Cercle cercle = new Cercle(10);
		cercle.setNom("Mon cercle");
		System.out.println(cercle.toString());
		
		Sphere s = new Sphere(0,0,0,20);
		s.setNom("Ma sphere");
		System.out.println(s.toString());
	}
}
