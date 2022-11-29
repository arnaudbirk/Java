import java.util.ArrayList;

public class Line extends IGeometryOperator {

	private ArrayList<Point> coords = new ArrayList<Point>();
	
	Line(ArrayList<Point> coords){
		setCoords(coords);
	}
	
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

	public ArrayList<Point> getCoords() {
		return coords;
	}

	public void setCoords(ArrayList<Point> coords) {
		this.coords = coords;
	}

}