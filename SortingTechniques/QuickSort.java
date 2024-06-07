package SortingTechniques;

import java.util.Arrays;

public class QuickSort {
	public void sort(int[] a)
	{
		Quick(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	
	public static void Quick(int[] nums,int low, int hi)
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
		
		Quick(nums,low,e);
		Quick(nums,s,hi);
	}
}

