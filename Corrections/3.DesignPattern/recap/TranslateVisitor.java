package Exo_recap;

public class TranslateVisitor extends GeometryVisitor{

	private double Tx;
	private double Ty;
	
	public TranslateVisitor(double tx, double ty){
		Tx = tx;
		Ty = ty;
	}
	
	@Override
	void visit(Point geo) {
		geo.setX( geo.getX() + Tx );
		geo.setY( geo.getY() + Ty );
	}

	@Override
	void visit(Line geo) {
		for (int i=0; i<geo.getCoords().size(); i++)
			visit(geo.getCoords().get(i));
	}

	@Override
	void visit(Polygon geo) {
		for (int i=0; i<geo.getContour().size(); i++)
			visit(geo.getContour().get(i));
	}

	@Override
	void visit(GeometryCollection geo) {
		for (int i=0; i<geo.getvGeo().size(); i++)
			geo.getvGeo().get(i).accept(this);
	}

	public double getTx() {
		return Tx;
	}

	public double getTy() {
		return Ty;
	}

	
}
