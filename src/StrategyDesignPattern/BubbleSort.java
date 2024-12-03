package StrategyDesignPattern;

public class BubbleSort implements SortingStrategy {

	@Override
	public void sort(int[] arr) {
		bubbleSort(arr);
		
	}
	  public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        boolean swapped;

	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;

	            // Last i elements are already sorted
	            for (int j = 0; j < n - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap arr[j] and arr[j + 1]
	                    swap(arr, j, j + 1);
	                    swapped = true;
	                }
	            }

	            // If no elements were swapped, array is sorted
	            if (!swapped) {
	                break;
	            }
	        }
	    }

	    // Utility method to swap two elements in the array
	    private static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }

}
