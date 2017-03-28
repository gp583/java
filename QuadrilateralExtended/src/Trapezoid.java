
public class Trapezoid extends Quadrilateral {
	protected double height;
	
	public Trapezoid(double a, double slant1, double b, double slant2, double h) {
		super (a, slant1, b, slant2);
		area = 0.5*(a+b)*h;
		height = h;
		figureName = "Trapezoid";
	}
}
