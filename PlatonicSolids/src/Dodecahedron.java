
public class Dodecahedron extends PlatonicSolid{

	public Dodecahedron(double e) {
		super(e);
		solidName = "Dodecahedron";
		numOfFaces = 12;
		numOfEdges = 30;
		totalSurfaceArea = (3*Math.sqrt(25+10*Math.sqrt(5)))*(e*e);
		volume = ((15+7*Math.sqrt(5))/4)*(e*e*e);
		totalEdgeLength = 30*e;

	}
}
