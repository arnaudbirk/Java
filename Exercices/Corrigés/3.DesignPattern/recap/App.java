package Exo_recap;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		System.out.println("----- Begin test -----" + '\n');

		// ------ simple factory ------
		
		ArrayList<Point> pt = new ArrayList<Point>();
		pt.add(new Point(1., 1.));
		pt.add(new Point(1., 0.));
		pt.add(new Point(0., 0.));
		pt.add(new Point(0., 1.));
		pt.add(new Point(1., 1.));

		Line line = FabriqueGeometry.getInstance().createLine(pt);
		Polygon pol = FabriqueGeometry.getInstance().createPolygon(line);

		// ------ visitor  ------
		
		PrintVisitor pVisitor = new PrintVisitor();
		pol.accept(pVisitor);

		System.out.println(pVisitor.getPrintVisitor());
		pVisitor.reinitPrint();
		
		TranslateVisitor tVisitor = new TranslateVisitor(3., 4.);
		pol.accept(tVisitor);
		pol.accept(pVisitor);
		System.out.println(pVisitor.getPrintVisitor());
		pVisitor.reinitPrint();

		// ------ collection ------
		
		GeometryCollection geoC = new GeometryCollection();
		geoC.addGeometry(line);
		geoC.addGeometry(pol);
		geoC.accept(pVisitor);
		System.out.println(pVisitor.getPrintVisitor());

		// ------ strategie ------
		
		pol.getConvexEnveloppe();
		
		convexhullstrategie_Jarvis algo = new convexhullstrategie_Jarvis();
		pol.setStrategie(algo);
		pol.getConvexEnveloppe();
		
		
		System.out.println('\n' + "----- End test -----");

	}

}
