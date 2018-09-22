public class BubbleSort implements SortingAlgorithm
{
	// Method to call sort -- implemented from SortingAlgorithm.
	public void sort(int [] a)
	{
		// Calls bubbleSort method.
		bubbleSort(a);
	}

	// Method to perform the bubble sort. 
	int[] bubbleSort(int[] a)
	{
		// Data Members
		boolean swapped = true;
		int temp = 0;
		
		// For loop to run through array items.
		for (int i = a.length - 1; i > 0 && swapped; i--)
		{
			// Sets swapped to false until values are eventually swapped.
			swapped = false;

			// Another for loop to perform swapping / sorting of values.
			for (int j = 0; j < i; j++)
			{
				// Conditional to sort values if value is less than j.
				if (a[j] > a[j + 1])
				{
					// Performs swap.
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swapped = true;
				}
			}
		}

		// Returns sorted array.
		return a;
	}
}