package StrategyDesignPattern;

public class Client {

	public static void main(String[] args) {
		
		SortingContext bubblecontext=new SortingContext(new BubbleSort());
		bubblecontext.performSort(new int[] {1,4,5,6,7,8});
		
		
		bubblecontext.setSortingStrategy(new QuickSort());
		bubblecontext.performSort(new int[] {4,5,7,8,9,2,1});

	}

}
