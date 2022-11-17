package Exo_visitor_ennonce;

public abstract class IGeometryOperator {

	public abstract void translate(double tx, double ty);
	public abstract void rotate(double angle);
	public abstract String print();
	public abstract double lenght();
	public abstract double surface();
	
}
