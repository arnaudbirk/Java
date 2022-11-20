package Exo_visitor_ennonce;

public class Point extends IGeometryOperator{

	private double X = 0.;
	private double Y = 0.;
	
	public Point(double X, double Y) {
		setX(X);
		setX(Y);
	}
	
	@Override
	public void translate(double tx, double ty) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rotate(double angle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String print() {
		return "Point["+X+","+Y+"]";
	}

	@Override
	public double lenght() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getX() {
		return X;
	}

	public void setX(double x) {
		X = x;
	}

	public double getY() {
		return Y;
	}

	public void setY(double y) {
		Y = y;
	}

}
