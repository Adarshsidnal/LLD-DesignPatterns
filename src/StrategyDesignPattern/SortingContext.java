package StrategyDesignPattern;

import java.util.Arrays;

public class SortingContext {
  public SortingStrategy sortingStrategy;
  public SortingContext( SortingStrategy sortingStrategy) {
	  this.sortingStrategy=sortingStrategy;
  }
  
  public void setSortingStrategy( SortingStrategy sortingStrategy) {
	  this.sortingStrategy=sortingStrategy;
  }
  
  public void performSort(int[] arr) {
	  sortingStrategy.sort(arr);
	  System.out.print(Arrays.toString(arr));
  }
}
