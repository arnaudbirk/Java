package Exo_visitor_ennonce;

import java.util.ArrayList;

public class Line extends IGeometryOperator {

	private ArrayList<Point> coords = new ArrayList<Point>();
	
	Line(ArrayList<Point> coords){
		setCoords(coords);
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
		String line = "Line[";
		for (int i=0; i<coords.size(); i++)
			line += coords.get(i).print();
		line += "]";
		return line;
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
