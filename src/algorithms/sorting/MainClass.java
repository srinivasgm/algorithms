package algorithms.sorting;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * SelectionSort selection=new SelectionSort(); int[] numbers=new int[]
		 * {123,2,2,4,5,6,7,9}; selection.sort(numbers);
		 * 
		 * for(int i:numbers) { System.out.println(i); }
		 */
		// EvenOdd e=new EvenOdd();
		QuickSort qs=new QuickSort();
		int[] numbers=new int[] {1,4,92,5,91};
		 qs.sort(numbers);
		 
		 Arrays.stream(numbers).forEach(System.out::println);
	}

}

/*
 * 3 19743 4 13749 3 13479
 */

