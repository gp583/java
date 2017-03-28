//Guilio Piccinonna
//Assignment 8

package jsjf;

import java.io.*;
import java.util.*;

public class BSTDriver {

	public static void main(String[] args) { 
		readData();
	}

	public static void readData(){

		Scanner scan = new Scanner(System.in);
		//	Scanner myFile;
		boolean notFound = true;
		int i;
		String fileName = "GolfCourses.txt";
		LinkedBinaryTree courses = new LinkedBinaryTree();


		while (notFound) {
			try {  

				scan = new Scanner(new File(fileName));
				int numberNodes = scan.nextInt();
				scan.nextLine();
				int root = 0, left, right;


				List<GolfCourse> nodes = new java.util.ArrayList<GolfCourse>();
				for (i = 0; i < numberNodes; i++)
					courses.insert(new GolfCourse(scan.nextLine(),scan.nextLine(),Double.parseDouble(scan.nextLine()),
							scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine()));

			}catch(Exception e){

			}
			notFound = false;
			courses.preorder();
			courses.inorder();
			courses.postorder();
			scan.close();
		}

	}
}
