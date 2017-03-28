
public class Point {

	private double xCoord;
	private double yCoord;

	public double getxCoord() {
		return xCoord;
	}

	public void setxCoord(double xCoord) {
		this.xCoord = xCoord;
	}

	public double getyCoord() {
		return yCoord;
	}

	public void setyCoord(double yCoord) {
		this.yCoord = yCoord;
	}

	public Point (double x, double y){

		xCoord = x;
		yCoord = y;
	}

	public String toString() {
		return "(" + xCoord + ", " + yCoord + ")";
	}
}
