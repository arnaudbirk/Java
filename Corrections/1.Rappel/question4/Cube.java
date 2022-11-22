package question4;

public class Cube extends Carre implements Scalable{
	
	private int z;
	
	public Cube(int x, int y, int z, double cote) {
		super(x, y, cote);
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	@Override
	public String toString() {
		return super.toString()+",z="+this.z;
	}
}
