//Guilio Piccinonna
//Assignment 6
//10-08-16

package assignment6;

public class Search {

	public void binarySearch(int[ ] array, int key)
	{
		int upperbound = 99;
		int lowerbound = 0;

		int position;  

		position = ( lowerbound + upperbound) / 2;

		while((array[position] != key) && (lowerbound <= upperbound))
		{
			if (array[position] > key)            
			{                                              
				upperbound = position - 1;   
			}                                                             
			else                                                   
			{                                                        
				lowerbound = position + 1;    
			}
			position = (lowerbound + upperbound) / 2;
		}
		if (lowerbound <= upperbound)
		{
			System.out.println(key + " was found at sub " + position);

		}
		else
			System.out.println("number not found");
	}
}