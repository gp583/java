//Guilio Piccinonna
//Assignment 3
//Data Structures

package jsjf;
import java.util.*;

public class LinearDriver {

	
	public static void main(String[] args) { 
		LinearDriver stack1 = new LinearDriver();
		stack1.menu();
	}

	public void menu(){
		FixConverter converter = new FixConverter();
		int input;
		String values;
		
		boolean run = true;
		
		while (run){
			
			System.out.println("This program allows the following conversion: ");
			System.out.println("1. prefix to infix \n2. prefix to postfix \n3. postfix to prefix");
			System.out.println("4. postfix to infix \n5. infix to prefix \n6. infix to postfix \n7. quit \n");
			System.out.println("What is your choice?");
			
			Scanner kb = new Scanner(System.in);
			values = kb.nextLine();
			input = Integer.parseInt(values);

			if (input == 1){
				System.out.println("Please enter the prefix values");
				values = kb.nextLine();
				converter.prefixToInfix(values);
				run = false;
			}
			if (input == 2){
				System.out.println("Please enter the prefix values");
				values = kb.nextLine();
				converter.prefixToPostfix(values);
			}
			if (input == 3){
				System.out.println("Please enter the postfix values");
				values = kb.nextLine();
				converter.postfixToPrefix(values);
			}
			if (input == 4){
				System.out.println("Please enter the postfix values");
				values = kb.nextLine();
				converter.postfixToInfix(values);
			}
			if (input == 5){
				System.out.println("Please enter the infix values");
				values = kb.nextLine();
				converter.infixToPrefix(values);
				run = false;
			}
			if (input == 6){
				System.out.println("Please enter the infix values");
				values = kb.nextLine();
				converter.infixToPostfix(values);
			}
			if (input == 7){
				System.out.println("Goodbye!");
				run = false;
			}
		}
	}
}


