import java.util.ArrayList;

public class FabriqueGeometry {

	private FabriqueGeometry(){;}
	static private FabriqueGeometry fabrique;
	
	static public final FabriqueGeometry getInstance() {
		if (fabrique == null) {
			fabrique = new FabriqueGeometry();
		}
		return fabrique;
	}
	
	 Point createPoint(double x, double y) {
		 return new Point(x,y);
	 }
	 
	 Line createLine(ArrayList<Point> points) {
		 return new Line(points);
	 }
	 
	 Polygon createPolygon(ArrayList<Line> contour) {
		 return new Polygon(contour);
	 }

	 Polygon createPolygon(Line contour) {
		 ArrayList<Line> vLine = new ArrayList<Line>();
		 vLine.add(contour);
		 return new Polygon(vLine);
	 }
	 
	 GeometryCollection createGeometryCollection(ArrayList<IGeometryOperator> geometries) {
		 return new GeometryCollection(geometries);
	 }

	
}
