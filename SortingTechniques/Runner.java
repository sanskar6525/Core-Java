package SortingTechniques;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {15,20,13,24,5,65,7,1};
		SelectionSort S1=new SelectionSort();
		System.out.println(Arrays.toString(arr));
		S1.sort(arr);
		
		QuickSort S2=new QuickSort();
		//S2.sort(arr);
		
		BubbleSort S3=new BubbleSort();
		S3.sort(arr);
		
	}

}
