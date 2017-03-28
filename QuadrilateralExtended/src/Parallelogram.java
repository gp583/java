
public class Parallelogram extends Quadrilateral{
	private double height;
	
	public Parallelogram(double b1, double b2,
			double h) {
		super(b1, b2, b1, b2); //calling 1st constructor in the quadrilateral class
		figureName = "Parallelogram";
		height = h;
		area = b2*h; //can also use side2 instead of b2; thanks to protected variables
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}


}
