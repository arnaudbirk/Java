package question2;

import question1.Carre;

public class Cube extends Carre{
	
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
