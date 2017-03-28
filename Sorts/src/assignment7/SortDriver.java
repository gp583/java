package assignment7;

import java.util.*;
public class SortDriver {

	int SIZE = 100000;
	//wanted to create SIZE and arrays here, but couldn't get it to work

	public static void main(String[] args) { 
		runMerge();
		runBubble();
		runInsertion();
		runDistribution();
	}

	public static void runBubble(){
		BubbleSort arrayBubble = new BubbleSort();
		int SIZE = 100000;
		int j = SIZE;
		int randArray[] = new int[SIZE];
		int orderArray[] = new int[SIZE];
		int reverseArray[] = new int[SIZE];

		for (int i = 0; i < randArray.length; i++)
			randArray[i] = randomFill();

		for (int i = 0; i < orderArray.length; i++)
			orderArray[i] = (i+1);

		for (int i = 0; i < reverseArray.length; i++){
			reverseArray[i] = j;
			j--;
		}

		Date d1 = new Date();
		arrayBubble.bubSort(orderArray, SIZE);
		Date d2 = new Date();
		long elapsedTime = d2.getTime() - d1.getTime();

		System.out.println("The order array has been sorted: " + checkOrdered(orderArray));
		System.out.println("The elapsed time of the bubblesort of the order array was: " + elapsedTime);

		d1 = new Date();
		arrayBubble.bubSort(reverseArray, SIZE);
		d2 = new Date();
		elapsedTime = d2.getTime() - d1.getTime();
		System.out.println("The reverse array has been sorted: " + checkOrdered(reverseArray));
		System.out.println("The elapsed time of the bubblesort of the reverse array was: " + elapsedTime);

		d1 = new Date();
		arrayBubble.bubSort(randArray, SIZE);
		d2 = new Date();
		elapsedTime = d2.getTime() - d1.getTime();
		System.out.println("The random array has been sorted: " + checkOrdered(randArray));
		System.out.println("The elapsed time of the bubblesort of the random array was: " + elapsedTime);
	}

	public static void runMerge(){
		int SIZE = 100000;
		int j = SIZE;
		int randArray[] = new int[SIZE];
		int orderArray[] = new int[SIZE];
		int reverseArray[] = new int[SIZE];

		for (int i = 0; i < randArray.length; i++)
			randArray[i] = randomFill();

		for (int i = 0; i < orderArray.length; i++)
			orderArray[i] = (i+1);

		for (int i = 0; i < reverseArray.length; i++){
			reverseArray[i] = j;
			j--;
		}

		MergeSort arrayMerge = new MergeSort();
		Date d1 = new Date();
		arrayMerge.mergeSort(orderArray, 0, SIZE-1);
		Date d2 = new Date();
		long elapsedTime = d2.getTime() - d1.getTime();
		System.out.println("The order array has been sorted: " + checkOrdered(orderArray));
		System.out.println("The elapsed time of the mergesort of the order array was: " + elapsedTime);

		d1 = new Date();
		arrayMerge.mergeSort(reverseArray, 0, SIZE-1);
		d2 = new Date();
		elapsedTime = d2.getTime() - d1.getTime();
		System.out.println("The reverse array has been sorted: " + checkOrdered(reverseArray));
		System.out.println("The elapsed time of the mergesort of the reverse array was: " + elapsedTime);

		d1 = new Date();
		arrayMerge.mergeSort(randArray, 0, SIZE-1);
		d2 = new Date();
		elapsedTime = d2.getTime() - d1.getTime();
		System.out.println("The random array has been sorted: " + checkOrdered(randArray));
		System.out.println("The elapsed time of the mergesort of the random array was: " + elapsedTime);
	}

	public static void runInsertion(){
		int SIZE = 100000;
		int j = SIZE;
		int randArray[] = new int[SIZE];
		int orderArray[] = new int[SIZE];
		int reverseArray[] = new int[SIZE];

		for (int i = 0; i < randArray.length; i++)
			randArray[i] = randomFill();

		for (int i = 0; i < orderArray.length; i++)
			orderArray[i] = (i+1);

		for (int i = 0; i < reverseArray.length; i++){
			reverseArray[i] = j;
			j--;
		}

		InsertionSort arrayInsert = new InsertionSort();
		Date d1 = new Date();
		arrayInsert.insertionSort(orderArray);
		Date d2 = new Date();
		long elapsedTime = d2.getTime() - d1.getTime();
		System.out.println("The order array has been sorted: " + checkOrdered(orderArray));
		System.out.println("The elapsed time of the insertion sort of the order array was: " + elapsedTime);

		d1 = new Date();
		arrayInsert.insertionSort(reverseArray);
		d2 = new Date();
		elapsedTime = d2.getTime() - d1.getTime();
		System.out.println("The reverse array has been sorted: " + checkOrdered(reverseArray));
		System.out.println("The elapsed time of the insertion sort of the reverse array was: " + elapsedTime);

		d1 = new Date();
		arrayInsert.insertionSort(randArray);
		d2 = new Date();
		elapsedTime = d2.getTime() - d1.getTime();
		System.out.println("The random array has been sorted: " + checkOrdered(randArray));
		System.out.println("The elapsed time of the insertion sort of the random array was: " + elapsedTime);
	}

	public static void runDistribution(){
		int SIZE = 100000;
		int j = SIZE;
		int randArray[] = new int[SIZE];
		int orderArray[] = new int[SIZE];
		int reverseArray[] = new int[SIZE];
		int k = 0;

		for (int i = 1; i <= 1000; i++){
			for (j = 1; j <= 100; j++){
				orderArray[k] = i;
				k++;
			}
		}
		k = 0;
		
		for (int i = 1000; i > 0; i--){
			for (j = 1; j <= 100; j++){
				reverseArray[k] = i;
				k++;
			}
		}
			for (int i = 0; i < randArray.length; i++)
				randArray[i] = randomFillD();
		
		DistributionSort arrayDistribute = new DistributionSort();
		Date d1 = new Date();
		arrayDistribute.distributeSort(orderArray);
		Date d2 = new Date();
		long elapsedTime = d2.getTime() - d1.getTime();
		System.out.println("The order array has been sorted: " + checkOrdered(orderArray));
		System.out.println("The elapsed time of the distribution sort of the order array was: " + elapsedTime);

		d1 = new Date();
		arrayDistribute.distributeSort(reverseArray);
		d2 = new Date();
		elapsedTime = d2.getTime() - d1.getTime();
		System.out.println("The reverse array has been sorted: " + checkOrdered(reverseArray));
		System.out.println("The elapsed time of the distribution sort of the reverse array was: " + elapsedTime);

		d1 = new Date();
		arrayDistribute.distributeSort(randArray);
		d2 = new Date();
		elapsedTime = d2.getTime() - d1.getTime();
		System.out.println("The random array has been sorted: " + checkOrdered(randArray));
		System.out.println("The elapsed time of the distribution sort of the random array was: " + elapsedTime);
	}


	public static int randomFill(){
		Random rand = new Random();
		int high = 500000;
		int low = 1;
		int randomNum = rand.nextInt(high-low) + low;
		return randomNum;
	}
	public static int randomFillD(){
		Random rand = new Random();
		int high = 1000;
		int low = 1;
		int randomNum = rand.nextInt(high-low) + low;
		return randomNum;
	}

	public static boolean checkOrdered(int array[]){
		for (int i = 0; i < array.length - 1; i++)
			if (array[i] > array[i+1])
				return false;
		return true;
	}

	public static void print10(int[] array){
		for (int i = 0; i < 10; i++){
			System.out.print(array[i]+ " ");
		}
	}
}
