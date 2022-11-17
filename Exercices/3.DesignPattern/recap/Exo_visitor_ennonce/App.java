package Exo_visitor_ennonce;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		System.out.println("----- Begin test -----" + '\n');

		ArrayList<Point> pt = new ArrayList<Point>();
		pt.add(new Point(1., 1.));
		pt.add(new Point(1., 0.));
		pt.add(new Point(0., 0.));
		pt.add(new Point(0., 1.));
		pt.add(new Point(1., 1.));
		
		Line line = new Line( pt );
		
		ArrayList<Line> vLine = new ArrayList<Line>();
		vLine.add(line);
		Polygon pol = new Polygon(vLine);
		
		System.out.println(pol.print());
		
		System.out.println('\n' + "----- End test -----");
		
		
	}

}
