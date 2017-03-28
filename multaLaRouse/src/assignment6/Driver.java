//Guilio Piccinonna
//Assignment 6
//10-08-16

package assignment6;
import java.util.*;

public class Driver {

	public static void main(String[] args) { 
		menu();	
	}

	public static void menu(){
		Search binSearch = new Search();
		Multiplication mult = new Multiplication();
		int[] numbers = new int[100];
		int value;
		int x;
		int y;
		String junk;
		String temp;

		Scanner kb = new Scanner(System.in);
		for (int i = 0; i < numbers.length; i++){
			numbers[i] = randomFill();
		}
		Arrays.sort(numbers);
		System.out.print("The first 5 values in the array are: "); 
		print5(numbers);
		System.out.println(" ");
		System.out.println("For what value would do want to search?");
		value = kb.nextInt();
		binSearch.binarySearch(numbers, value);
		System.out.println("What two numbers would you like to multiply using multiplication a la Rousse?");
		junk = kb.nextLine();
		temp = kb.nextLine();
		StringTokenizer st = new StringTokenizer(temp, " ");
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		System.out.print("The product " + x + "*" + y + " = " + mult.iteralaRousse(x, y) + " ");
		System.out.println("using iterative multiplication a la Rousse");
		System.out.print("The product " + x + "*" + y + " = " + mult.recuralaRousse(x, y) + " ");
		System.out.println("using recursive multiplication a la Rousse");
	}

	public static void print5(int[] array){
		for (int i = 0; i < 5; i++){
			System.out.print(array[i]+ " ");
		}
	}

	public static int randomFill(){
		Random rand = new Random();
		int high = 32767;
		int low = 1;
		int randomNum = rand.nextInt(high-low) + low;
		return randomNum;
	}
	
}