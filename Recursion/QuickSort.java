package Recursion;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,10,5,4,2,9,221,167,2232,38,55,20,19,0};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void sort(int[] nums,int low, int hi)
	{
		if(low>=hi) {
			return;
		}
		
		int s=low;
		int e=hi;
		int m=s+(e-s)/2;
		int pivot=nums[m];
		
		while(s<=e) {
			while(nums[s]<pivot)
				s++;
			while(nums[e]>pivot)
				e--;
			
			if(s<=e) {
				int temp=nums[s];
				nums[s]=nums[e];
				nums[e]=temp;
				s++;
				e--;
			}
		}
		//now the pivot is at the right position and thus we sort the two halves
		
		sort(nums,low,e);
		sort(nums,s,hi);
	}
	

}




