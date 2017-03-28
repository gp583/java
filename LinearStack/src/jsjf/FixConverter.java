//Guilio Piccinonna
//Assignment 3

package jsjf;

import java.util.StringTokenizer;

public class FixConverter {
	LinkedStack<String> stack1 = new LinkedStack<String>();
	String individ;
	String x;
	String y; 
	String w;
	String z;
	String k;
	String result;
	StringTokenizer st;
	String[] myTokens;
	int i;

	private boolean isOperator(String c){
		if((c.equals("+")) || (c.equals("-")) || (c.equals("*")) || (c.equals("/")) || (c.equals("$")) || (c.equals("%")))
			return true;
		return false;
	}

	public static int precedence(String c) {
		if ((c.equals("+")) || (c.equals("-"))) {
			return 1;
		} else if ((c.equals("*")) || (c.equals("/")) || c.equals("%")) {
			return 2;
		}
		else
			return 3;
	}

	public void prefixToInfix(String prefix){

		st = new StringTokenizer(prefix, " ");
		while (st.hasMoreTokens())
		{
			individ = st.nextToken();
			if(isOperator(individ) == true)
			{
				stack1.push(individ);
			}
			else
			{
				if (isOperator(stack1.peek()) == true)
					stack1.push(individ);
				else{ 
					while ((!stack1.isEmpty()) && (!isOperator(stack1.peek()))){
						x = stack1.pop();
						y = stack1.pop();
						w = x + y + individ;
						individ = w;
					}
					stack1.push(w);
				}
			}

		}
		System.out.println(stack1.pop());
	}

	public void prefixToPostfix(String prefix){

		st = new StringTokenizer(prefix);
		while (st.hasMoreTokens())
		{
			individ = st.nextToken();
			if(isOperator(individ) == true)
			{
				stack1.push(individ);
			}
			else
			{
				if (isOperator(stack1.peek()) == true)
					stack1.push(individ);
				else{ 
					while ((!stack1.isEmpty()) && (!isOperator(stack1.peek()))){
						x = stack1.pop();
						y = stack1.pop();
						w = x + individ + y;
						individ = w;
					}
					stack1.push(w);
				}
			}

		}
		System.out.println(stack1.pop());
	}

	public void postfixToPrefix(String postfix){

		st = new StringTokenizer(postfix);
		while (st.hasMoreTokens())
		{
			individ = st.nextToken();
			if(isOperator(individ) == false)
			{
				stack1.push(individ);
			}
			else
			{
				x = stack1.pop();
				y = stack1.pop();
				w = individ + y + x;
				stack1.push(w);
			}

		}
		System.out.println(stack1.pop());
	}

	public void postfixToInfix(String postfix){

		st = new StringTokenizer(postfix);
		while (st.hasMoreTokens())
		{
			individ = st.nextToken();
			if(isOperator(individ) == false)
			{
				stack1.push(individ);
			}
			else
			{
				x = stack1.pop();
				y = stack1.pop();
				w = "(" + y + individ + x + ")";
				stack1.push(w);
			}

		}
		System.out.println(stack1.pop());
	}
	
	public void infixToPrefix(String infix){

		LinkedStack<String> operandStack = new LinkedStack<String>();
		LinkedStack<String> operatorStack = new LinkedStack<String>();
		st = new StringTokenizer(infix, " ");

		while (st.hasMoreTokens()) 
		{
			k = st.nextToken();
			if (!isOperator(k)) 
			{
				operandStack.push(k);
			} else if (operatorStack.isEmpty())
			{
				operatorStack.push(k);
			} else {
				if (precedence(operatorStack.peek()) >= precedence(k)) {
					do {
						x = operandStack.pop();
						y = operandStack.pop();
						String z = operatorStack.pop();
						String result = z + y + x;
						operandStack.push(result);
					} while (!operatorStack.isEmpty()

							&& precedence(operatorStack.peek()) >= precedence(k));

				}
				operatorStack.push(k);
			}
		}
		do {
			x = operandStack.pop();
			y = operandStack.pop();
			z = operatorStack.pop();
			String result = z + x + y;

			operandStack.push(result);

		} while (!operatorStack.isEmpty());

		System.out.println("Result = " + operandStack.pop());
	}

	public void infixToPostfix(String infix){

		LinkedStack<String> operandStack = new LinkedStack<String>();
		LinkedStack<String> operatorStack = new LinkedStack<String>();
		st = new StringTokenizer(infix, " ");

		while (st.hasMoreTokens()) 
		{
			k = st.nextToken();
			if (!isOperator(k)) 
			{
				operandStack.push(k);
			} else if (operatorStack.isEmpty())
			{
				operatorStack.push(k);
			} else {
				if (precedence(operatorStack.peek()) >= precedence(k)) {
					do {
						x = operandStack.pop();
						y = operandStack.pop();
						String z = operatorStack.pop();
						String result = x + y + z;
						operandStack.push(result);
					} while (!operatorStack.isEmpty()

							&& precedence(operatorStack.peek()) >= precedence(k));

				}
				operatorStack.push(k);
			}
		}
		do {
			x = operandStack.pop();
			y = operandStack.pop();
			z = operatorStack.pop();
			String result = x + y + z;

			operandStack.push(result);

		} while (!operatorStack.isEmpty());

		System.out.println("Result = " + operandStack.pop());
	}
}

