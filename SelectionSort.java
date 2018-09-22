public class SelectionSort implements SortingAlgorithm
{
	// Method to call sort -- implemented from SortingAlgorithm.
	public void sort(int [] a)
	{
		// Calls selectionSort method.
		selectionSort(a);
	}

	// Method to perform the selection sort. 
	int [] selectionSort(int[] a)
	{
		// Data Members
		int temp = 0;
		int min = 0;

		// For loop to run through array items once.
        for (int i = 0; i < a.length - 1; i++) 
        {
        	// Adjust minimum value to value of i.
            min = i;
            for (int j = i + 1; j < a.length; j++) 
            {
            	// Conditional to verify if value is less than i.
                if (a[j] < a[min]) 
                {
                	// Changes minimum value to j value if less than the current min.
                    min = j;
                }
            }

            // Performs the sort/swapping of items. 
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        } 
       
        // Returns sorted array.
    	return a;
    }
}