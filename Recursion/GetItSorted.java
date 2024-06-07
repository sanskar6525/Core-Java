package Recursion;

import java.util.Arrays;

public class GetItSorted {
	
	static int[] a= {1,10,5,4,2,9,221,167,2232,38,55,20,19,0};
	static int n=a.length;
	
	public static void SelectionSort()
	{
		for(int i=0;i<n;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min])
					min=j;
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		System.out.println("Selection Sort: "+Arrays.toString(a));
	}
	
	public static void InsertionSort()
	{
		int j,key;
		for(int i=1;i<n;i++)
		{
			j=i-1;
			key=a[i];
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		System.out.println("Insertion Sort: "+Arrays.toString(a));
	}

	public static void BubbleSort()
	{
		
	}

	public static void QuickSort(int low,int high)
	{
		
	}
	
	public static void MergeSort()
	{
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InsertionSort();
	
		//QuickSort(0,n-1);
		SelectionSort();
		
	}

}
