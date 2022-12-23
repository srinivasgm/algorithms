package algorithms.sorting;

public class MainClass {

	public static void main(String[] args) {
		
		SelectionSort selection=new SelectionSort();
		int[] numbers=new int[] {123,2,2,4,5,6,7,9};
		selection.sort(numbers);
		
		  for(int i:numbers) { System.out.println(i); }
		 
	}

}

/*
 * 3 19743 4 13749 3 13479
 */

