
public class Quadrilateral {
	protected double side1;
	protected double side2;
	protected double side3;
	protected double side4;
	protected double perimeter;
	protected double area;
	protected String figureName;
	
	public Quadrilateral(double a, double b, double c, double d) {
		side1 = a;
		side2 = b;
		side3 = c;
		side4 = d;
		perimeter = a + b + c + d;
		figureName = "quadrilateral";
	}

	public Quadrilateral(double b1, double b2, double h) {
		side1 = b1;
		side2 = b2;
		side3 = b1;
		side4 = b2;
		//perimeter = 2*b1 + 2*b2;
	}

	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	public double getSide4() {
		return side4;
	}
	public void setSide4(double side4) {
		this.side4 = side4;
	}
	
	public String getFigureName() {
		return figureName;
	}
	public void setFigureName(String figureName) {
		this.figureName = figureName;
	}
	public String toString() {
		return "this figure is a " + figureName + " the perimeter is " + perimeter + " and the area is " + area;
	}
}
