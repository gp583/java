//Guilio Piccinonna
//Assignment 6
//10-08-16

package assignment6;

public class Multiplication {
	int smaller;
	int larger;
	int sum = 0;

	public int iteralaRousse(int x, int y){
		if (x > y){
			larger = x;
			smaller = y;
		}
		if (y > x){
			larger = y;
			smaller = x;
		}

		while (!(smaller == 0)){
			if (!(smaller % 2 == 0)){
				sum += larger;
			}
			smaller = (smaller / 2);
			larger = (larger * 2);
		}
		return sum;
	}
	
	public int recuralaRousse(int x, int y){
		if (y == 0)
			return 0;

		if (!(y % 2 == 0))
			return  x + recuralaRousse((x * 2), (y / 2));

		return recuralaRousse((x * 2), (y / 2));
	}
}
