package Exo_recap;

import java.util.ArrayList;

public class Polygon extends IGeometryOperator {

	private ArrayList<Line> contour = new ArrayList<Line>();
	private convexhullstrategie strategie = new convexhullstrategie_Graham(); // une stratégie par défaut
	
	Polygon(ArrayList<Line> contour){
		setContour(contour);
	}
	
	@Override
	public void accept(GeometryVisitor visitor) {
		visitor.visit(this);
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

	public ArrayList<Line> getContour() {
		return contour;
	}

	public void setContour(ArrayList<Line> contour) {
		this.contour = contour;
	}
	
	public Polygon getConvexEnveloppe() {
		return strategie.execute(this);
	}
	
	public void setStrategie(convexhullstrategie strategie) {
		this.strategie = strategie;
	}

	
	
}
