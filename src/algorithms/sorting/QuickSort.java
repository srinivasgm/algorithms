package algorithms.sorting;

public class QuickSort {
	
	public void sort(int []numbers) {
		sort(numbers,0,numbers.length-1);
	}
	
	  private static void sort(int[] array, int lowIndex, int highIndex) {
		  
		  if(lowIndex>=highIndex) return;

		  int pivot=array[highIndex];
		  int lp=lowIndex;
		  int rp=highIndex-1;
		  
		  while(lp<rp) {
			  
			  while(array[lp]<pivot && lp<rp) {
				  lp++;
			  }
			  while(array[rp]>pivot && lp<rp) {
				  rp--;
			  }
			  
			  swap(array,lp,rp);
		  }
		  
		  if(array[lp]>pivot)
		  swap(array,lp,highIndex);
		  
		  lp=highIndex;
		  
		  sort(array,lowIndex,lp-1);
		  sort(array,lp+1,highIndex);
		  
		   
		  }
	
	
		

	private static void swap(int[] numbers, int lp, int rp) {
		int temp=numbers[lp];
		numbers[lp]=numbers[rp];
		numbers[rp]=temp;
	}

	//10,91,2,4,5,6
	//59124106
	//
}
