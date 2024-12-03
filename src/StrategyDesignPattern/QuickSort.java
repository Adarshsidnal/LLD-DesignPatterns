package StrategyDesignPattern;

public class QuickSort implements SortingStrategy{

	@Override
	   public void sort(int[] arr) {
		quickSort(arr,0,arr.length-1);
	   }
	 public static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            // Partition the array and get the pivot index
	            int pivotIndex = partition(arr, low, high);

	            // Recursively sort elements before and after partition
	            quickSort(arr, low, pivotIndex - 1);
	            quickSort(arr, pivotIndex + 1, high);
	        }
	    }

	    // Partition method to place the pivot element in the correct position
	    private static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high];  // Choosing the last element as pivot
	        int i = low - 1;  // Index for the smaller element

	        for (int j = low; j < high; j++) {
	            if (arr[j] <= pivot) {
	                i++;
	                // Swap arr[i] and arr[j]
	                swap(arr, i, j);
	            }
	        }
	        // Swap arr[i+1] and arr[high] (pivot)
	        swap(arr, i + 1, high);
	        return i + 1;
	    }

	    // Utility method to swap two elements in the array
	    private static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
}
