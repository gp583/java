package assignment7;

public class BubbleSort {

	public void bubSort( int[] array,int size){
		int temp;

		for (int passno = 1; passno < size; passno++)
		{
			for (int i=0;i < size-passno;i++)
			{
				if(array[i] > array[i+1]){
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		}
	}
}
