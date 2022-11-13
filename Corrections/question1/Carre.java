package question1;

public class Carre {
	
	private int x,y;
	
	protected double cote;
	
	public Carre(int x, int y, double cote) {
		this.x = x;
		this.y = y;
		this.cote = cote;
	}
	
	public Carre(int cote) {
		this(0,0, cote);
	}

	public double getCote() {
		return cote;
	}

	public void setCote(double cote) {
		this.cote = cote;
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
	
	@Override
	public String toString() {
		return "cote="+this.cote+",x="+this.x+",y="+this.y;
	}

}
