
public class Tetrahedron extends PlatonicSolid {

	public Tetrahedron(double e) {
		super(e);
		solidName = "Tetrahedron";
		numOfFaces = 4;
		numOfEdges = 6;
		totalSurfaceArea = Math.sqrt(3)*(e*e);
		volume = (Math.sqrt(2)/12)*(e*e*e);
		totalEdgeLength = 6*e;
	}
}
