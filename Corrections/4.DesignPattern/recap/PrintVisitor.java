public class PrintVisitor extends GeometryVisitor {

	public PrintVisitor(){;}
	
	private String printVisitor;
	
	@Override
	void visit(Point geo) {
		printVisitor += "Point["+geo.getX()+","+geo.getY()+"]";
	}

	@Override
	void visit(Line geo) {
		printVisitor = "Line[";
		for (int i=0; i<geo.getCoords().size(); i++)
			this.visit(geo.getCoords().get(i));
		printVisitor += "]";
	}

	@Override
	void visit(Polygon geo) {
		printVisitor = "Polygon[";
		for (int i=0; i< geo.getContour().size(); i++)
			this.visit(geo.getContour().get(i));
		printVisitor += "]";
	}

	@Override
	void visit(GeometryCollection geo) {
		printVisitor = "GeometryCollection[";
		for (int i=0; i< geo.getvGeo().size(); i++) {
			geo.getvGeo().get(i).accept(this);
		}
		printVisitor += "]";
	}
	
	public String getPrintVisitor() {
		return printVisitor;
	}
	public void reinitPrint() {
		printVisitor = "";
	}

}
