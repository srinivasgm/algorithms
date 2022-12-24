package algorithms.sorting;

public class EvenOdd {
	
	public void sort(int []numbers) {
		
		int i=0;
		for(int j=0;j<numbers.length;j++) {
			
			if(numbers[j]%2==0) {
				int temp=numbers[j];
				numbers[j]=numbers[i];
				numbers[i]=temp;
				i++;
			}
			
		}
		
		for(int k:numbers) {
			System.out.println(k);
		}

}

	private void swap(int[] numbers, int i, int j) {
		int temp=numbers[i];
		numbers[i]=numbers[j];
		numbers[j]=temp;
		
	}
}
