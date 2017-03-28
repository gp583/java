package assignment7;

public class DistributionSort {

	public void distributeSort(int [] array){
		int k = 0;
		int[] counter = new int[1001];
		
		for (int i = 0; i < array.length; i++){
			counter[array[i]]++;
		}
		
		for (int i = 1; i <= 1000; i++){
			
			for (int j = 0; j < counter[i]; j++){
				array[k] = i;
				k++;
			}
		}
	}
}
