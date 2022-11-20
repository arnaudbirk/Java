package Exo_recap;

public abstract class IGeometryOperator {

	public abstract void accept(GeometryVisitor visitor);
	public abstract double lenght();
	public abstract double surface();
	
}
