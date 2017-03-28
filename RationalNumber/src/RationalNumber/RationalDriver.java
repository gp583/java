//Guilio Piccinonna
//11-2-14
//Assignment 8: fractions
//program reads in a pair of fractions then computes the sum, difference, product, and quotient
//program will prompt user to repeat process as many times as desired

package RationalNumber;

import java.util.*;

public class RationalDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		while (true) {
			System.out.println("Hello!");
			System.out.println("Enter first fraction");
			RationalNumber frac1 = new RationalNumber(kb.nextInt(),
					kb.nextInt());
			System.out.println("Enter second fraction");
			RationalNumber frac2 = new RationalNumber(kb.nextInt(),
					kb.nextInt());

			RationalNumber sum, diff, prod, quot, gcdiv;
			sum = frac1.add(frac2);
			sum.reduce();
			System.out.println("The sum of " + frac1 + " and " + frac2 + " is "
					+ sum);
			diff = frac1.sub(frac2);
			diff.reduce();
			System.out.println("The difference of " + frac1 + " and " + frac2
					+ " is " + diff);
			prod = frac1.mult(frac2);
			prod.reduce();
			System.out.println("The product of " + frac1 + " and " + frac2
					+ " is " + prod);
			quot = frac1.div(frac2);
			quot.reduce();
			System.out.println("The quotient of " + frac1 + " and " + frac2
					+ " is " + quot);
			frac1.reduce();
			System.out.print("Do you wish to run again? (yes/no) ");
			String run = kb.next();
			if (run.equalsIgnoreCase("no")) {
				System.out.println("Goodbye!");
				break;
			}
		}
		kb.close();
	}
}

/*
Hello!
Enter first fraction
7 8
Enter second fraction
2 4
The sum of (7/8) and (2/4) is (11/8)
The difference of (7/8) and (2/4) is (3/8)
The product of (7/8) and (2/4) is (7/16)
The quotient of (7/8) and (2/4) is (7/4)
Do you wish to run again? (yes/no) no
Goodbye!
*/
