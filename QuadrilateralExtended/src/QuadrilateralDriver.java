
public class QuadrilateralDriver  {

	public static void main(String[] args) {
		Quadrilateral quad1 = new Quadrilateral(5, 8, 12, 7);
		System.out.println(quad1);
		Parallelogram para1 = new Parallelogram(8, 12, 7);
		System.out.println(para1);
		Square sq1 = new Square(5);
		System.out.println(sq1);

		Trapezoid trap1 = new Trapezoid(10,7,6,8,4);
		System.out.println(trap1);
		
		Rectangle rec1 = new Rectangle(15.3, 9.6);
		System.out.println(rec1);

	}

}
