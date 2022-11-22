package question6;

public class Carre extends Forme implements Scalable{
	
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
		return "Forme="+this.getNom()+",surface="+this.surface()+",cote="+this.cote+",x="+this.x+",y="+this.y;
	}

	@Override
	public void increase(int factor) {
		this.cote *= factor;		
	}

	@Override
	public void decrease(int factor) {
		this.cote /= factor;
		
	}

	@Override
	public double surface() {
		return cote*cote;
	}

}
