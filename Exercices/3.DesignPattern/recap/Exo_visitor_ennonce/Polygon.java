package Exo_visitor_ennonce;

import java.util.ArrayList;

public class Polygon extends IGeometryOperator {

	private ArrayList<Line> contour = new ArrayList<Line>();
	
	Polygon(ArrayList<Line> contour){
		setContour(contour);
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
		String pol = "Polygon[";
		for (int i=0; i<contour.size(); i++)
			pol += contour.get(i).print();
		pol += "]";
		return pol;
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

	public enum algoEnveloppeType{
		graham,
		jarvis
	}
	
	public Polygon getConvexEnveloppe(algoEnveloppeType type) {
		if (type == algoEnveloppeType.graham)
			return grahamAlgorithm();
		else if (type == algoEnveloppeType.jarvis)
			return jarvisAlgorithm();
		return null;
	}
	
	private Polygon grahamAlgorithm() {
		// TODO 
		return new Polygon(contour);
	}

	public Polygon jarvisAlgorithm() {
		// TODO
		return new Polygon(contour);
	}

	
	
}
