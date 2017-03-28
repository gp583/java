
public class Icosahedron extends PlatonicSolid {

	public Icosahedron(double e) {
		super(e);
		solidName = "Icosahedron";
		numOfFaces = 20;
		numOfEdges = 30;
		totalSurfaceArea = (5*Math.sqrt(3))*(e*e);
		volume = (5*(3+Math.sqrt(5)))*(e*e*e);
		totalEdgeLength = 30*e;
	}
}
