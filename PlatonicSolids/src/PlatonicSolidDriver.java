//Guilio Piccinonna
//12-5-14
//Assignment XII 
//Program identifies platonic solids and calculates various measures about them

import java.util.*;
public class PlatonicSolidDriver {

	public static void main(String[] args) {
		int polyNo = 0;
		double edge = 0;
		Scanner kb = new Scanner(System.in);

		while (polyNo != 6) {
			System.out.print("Please select your Polyhedron: ");
			System.out.println("\n1) Hexahedron\n2) Tetrahedron\n3) Octahedron\n4) Dodecahedron\n5) Icosahedron\n6) Quit");
			polyNo = kb.nextInt();

			if ( polyNo == 1) {
				System.out.print("Please enter the edge length: ");
				edge = kb.nextDouble();
				Hexahedron hexa1 = new Hexahedron(edge);
				System.out.println(hexa1);
			}
			if ( polyNo == 2) {
				System.out.print("Please enter the edge length: ");
				edge = kb.nextDouble();
				Tetrahedron tetra1 = new Tetrahedron(edge);
				System.out.println(tetra1);
			}
			if ( polyNo == 3) {
				System.out.print("Please enter the edge length: ");
				edge = kb.nextDouble();
				Octahedron octa1 = new Octahedron(edge);
				System.out.println(octa1);
			}
			if ( polyNo == 4) {
				System.out.print("Please enter the edge length: ");
				edge = kb.nextDouble();
				Dodecahedron dode1 = new Dodecahedron(edge);
				System.out.println(dode1);
			}
			if ( polyNo == 5) {
				System.out.print("Please enter the edge length: ");
				edge = kb.nextDouble();
				Icosahedron icosa1 = new Icosahedron(edge);
				System.out.println(icosa1);
			}
			if ( polyNo == 6) {
				System.out.println("Goodbye!");
				kb.close();
			}
		}
	}
}
/*
Please select your Polyhedron: 
1) Hexahedron
2) Tetrahedron
3) Octahedron
4) Dodecahedron
5) Icosahedron
6) Quit
3
Please enter the edge length: 4.5
This solid is a Octahedron. It has 8.0 faces and 12.0 edges.
This Octahedron has an edge length of 4.5, total edge length of 54.0,
total surface area of 70.148, and volume of 42.957
Please select your Polyhedron: 
1) Hexahedron
2) Tetrahedron
3) Octahedron
4) Dodecahedron
5) Icosahedron
6) Quit
6
Goodbye!
*/