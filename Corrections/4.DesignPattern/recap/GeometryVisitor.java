public abstract class GeometryVisitor {

	public GeometryVisitor(){;}

	abstract void visit(Point geo);
	abstract void visit(Line geo);
	abstract void visit(Polygon geo);
	abstract void visit(GeometryCollection geo);
	
}
