package assignment7;

public class InsertionSort {


	public void insertionSort(int[] data)
	{
		for (int index = 1; index < data.length; index++)
		{
			int key = data[index];
			int position = index;

			// shift larger values to the right 
			while (position > 0 && data[position-1] > key)
			{
				data[position] = data[position-1];
				position--;
			}

			data[position] = key;
		}
	}
}
