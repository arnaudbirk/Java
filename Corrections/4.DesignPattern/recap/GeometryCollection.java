import java.util.ArrayList;

public class GeometryCollection extends IGeometryOperator{

	private ArrayList<IGeometryOperator> vGeo = new ArrayList<IGeometryOperator>();
	
	public GeometryCollection(){;}
	public GeometryCollection(ArrayList<IGeometryOperator> vGeo){
		this.vGeo = vGeo;
	}
	
	public void addGeometry(IGeometryOperator geo) {
		vGeo.add(geo);
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

	public ArrayList<IGeometryOperator> getvGeo() {
		return vGeo;
	}

}
