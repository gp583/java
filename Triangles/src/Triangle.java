//Guilio Piccinonna
//11-17-2014
//Assignment X
//Program reads in three points of a triangle &
//prints its sides, perimeter, and area

import java.util.Scanner;

public class Triangle {

	private Point point1;
	private Point point2;
	private Point point3; 
	private static double area;
	private static double perimeter;
	private static double side1;
	private static double side2;
	private static double side3;

	public Triangle (Point pt1, Point pt2, Point pt3, double a, double p, double s1, double s2, double s3){
		point1 = pt1;
		point2 = pt2;
		point3 = pt3;
		area = a;
		perimeter = p;
		side1 = s1;
		side2 = s2;
		side3 = s3;

	}
	
	public Triangle (Point pt1, Point pt2, Point pt3){
		point1 = pt1;
		point2 = pt2;
		point3 = pt3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		while (true) {
			System.out.println("enter first point (x y)");
			Point point1 = new Point(kb.nextDouble(),
					kb.nextDouble());
			System.out.println("enter second point (x y)");
			Point point2 = new Point(kb.nextDouble(),
					kb.nextDouble());
			System.out.println("enter third point (x y)");
			Point point3 = new Point(kb.nextDouble(),
					kb.nextDouble());
			Triangle myTri = new Triangle(point1, point2, point3);
			myTri.calcMeasures();
			System.out.println(myTri);
			System.out.print("Do you wish to run again? (yes/no) ");
			String run = kb.next();
			if (run.equalsIgnoreCase("no")) {
				System.out.println("Goodbye");
				break;
			}
		}
		kb.close();
	}
	public String toString () {
		return "The given points " + point1 + ", " + point2 + ", and " + point3 + " \ncreate a triangle with the sides "
				+ side1 + ", " + side2 + ", and " + side3 +
				". \nThe perimeter of the given triangle is " + perimeter + " and the area is " + area; 
	}
	
	public void calcMeasures(){
		double s;

		side1 = Math.sqrt((point2.getxCoord()-point1.getxCoord())*(point2.getxCoord()-point1.getxCoord()) + (point2.getyCoord()-point1.getyCoord())*(point2.getyCoord()-point1.getyCoord()));
		side2 = Math.sqrt((point3.getxCoord()-point1.getxCoord())*(point3.getxCoord()-point1.getxCoord()) + (point3.getyCoord()-point1.getyCoord())*(point3.getyCoord()-point1.getyCoord()));
		side3 = Math.sqrt((point3.getxCoord()-point2.getxCoord())*(point3.getxCoord()-point2.getxCoord()) + (point3.getyCoord()-point2.getyCoord())*(point3.getyCoord()-point2.getyCoord()));

		perimeter = side1 + side2 + side3;
		s = (side1 + side2 + side3)/2;
		area = (Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
	}
}

/*
enter first point (x y)
3 4
enter second point (x y)
3 6
enter third point (x y)
7 9
The given points (3.0, 4.0), (3.0, 6.0), and (7.0, 9.0) 
create a triangle with the sides 2.0, 6.4031242374328485, and 5.0. 
The perimeter of the given triangle is 13.403124237432849 and the area is 4.0
Do you wish to run again? (yes/no) no
Goodbye
*/