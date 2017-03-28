
public class Octahedron extends PlatonicSolid {

	public Octahedron(double e) {
		super(e);
		solidName = "Octahedron";
		numOfFaces = 8;
		numOfEdges = 12;
		totalSurfaceArea = (2*(e*e))*(Math.sqrt(3));
		volume = (Math.sqrt(2)/3)*(e*e*e);
		totalEdgeLength = 12*e;
	}
}