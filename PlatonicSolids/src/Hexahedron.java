
public class Hexahedron extends PlatonicSolid {

	public Hexahedron(double e) {
		super(e);
		solidName = "Hexahedron";
		numOfFaces = 6;
		numOfEdges = 12;
		totalSurfaceArea = 6*(e*e);
		volume = (e*e*e);
		totalEdgeLength = 12*e;
	}
}
