package question3;

public class Cercle {
	
	private int x,y;
	private double rayon;
	
	public Cercle(int x, int y, double rayon) {
		this.x = x;
		this.y = y;
		this.rayon = rayon;
	}
	
	public Cercle(double rayon) {
		this(0,0,rayon);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getRayon() {
		return rayon;
	}
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	@Override
	public String toString() {
		return "rayon="+rayon+",x="+this.x+",y="+this.y;
	}
}
