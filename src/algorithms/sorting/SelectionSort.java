package algorithms.sorting;

public class SelectionSort {

	void sort(int[] numbers) {

		int pivot=0;
		int index=0;
		int smallest=Integer.MAX_VALUE;
		
		while(pivot<numbers.length) {
			
			smallest=numbers[pivot];
			
			for(int j=pivot+1;j<numbers.length;j++) {
				
				if(numbers[j]<smallest) {
					smallest=numbers[j];
					index=j;
				}
				
			}
			
			
			if(index>pivot) {
			swap(numbers,index,pivot);}
			
			pivot++;
			
			
		}

			

		

	}

	
	  private void swap(int[] numbers, int index, int pointer) {
	  
	  int temp = numbers[index]; numbers[index] = numbers[pointer];
	  numbers[pointer] = temp;
	  
	  }
	 

}
