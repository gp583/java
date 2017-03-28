
public class PlatonicSolid {
	protected double edgeLength;
	protected String solidName;
	protected double numOfFaces;
	protected double numOfEdges;
	protected double volume;
	protected double totalSurfaceArea;
	protected double totalEdgeLength;

	public PlatonicSolid(double e) {
		edgeLength = e;
		solidName = "Platonic Solid";
	}
	public double getEdgeLength() {
		return edgeLength;
	}
	public void setEdgeLength(double edgeLength) {
		this.edgeLength = edgeLength;
	}
	public String getSolidName() {
		return solidName;
	}
	public void setSolidName(String solidName) {
		this.solidName = solidName;
	}
	//public String toString() {
//		return ("This solid is a " + solidName + ". It has " + numOfFaces + " faces and " + numOfEdges + " edges.\nThis " + solidName + " has an edge length of " + edgeLength + 
	//			", total edge length of " + totalEdgeLength + ",\ntotal surface area of " + String.format("%5.3f",totalSurfaceArea) + ", and volume of " + String.format("%5.3f",volume));
	}



