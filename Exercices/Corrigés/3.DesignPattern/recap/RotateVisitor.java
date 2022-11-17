package Exo_recap;

public class RotateVisitor extends GeometryVisitor {

	private double angle;
	
	RotateVisitor(double angle){
		this.angle = angle;
	}
	
	@Override
	void visit(Point geo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void visit(Line geo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void visit(Polygon geo) {
		// TODO Auto-generated method stub
		
	}

	public double getAngle() {
		return angle;
	}

	@Override
	void visit(GeometryCollection geo) {
		// TODO Auto-generated method stub
		
	}

}