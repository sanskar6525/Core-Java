package Recursion;

import java.util.Arrays;

public class MergeSort {

	public static int a[] = { 12, 11, 13, 5, 6, 7 };
	
	 static void printArray(int arr[])
	    {
		    System.out.println("\n\n");
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println("\n\n");
	    }
	  
	public static void Merge(int [] a,int l, int m,int r)
	{
		//Size of the two sub-arrays
		int n1=m-l+1;
		int n2=r-m;
		
		//Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];
		
        //Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = a[l + i];
       //printArray(L);
        for (int j = 0; j < n2; ++j)
            R[j] = a[m + 1 + j];
        //printArray(R);
        //Merge the temp arrays
 
        //Initial indices of first and second sub-arrays
        int i = 0, j = 0;
        
        //Initial index of merged sub-array array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            }
            else {
                a[k] = R[j];
                j++;
            }
            k++;
        }
        
        //Copy remaining elements of L[] if any
        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }
 
        //Copy remaining elements of R[] if any
        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
 
	}
	
	public static void Sorting(int[] a,int l,int r)
	{
		if(l<r)
		{
			int m=(l+(r-1))/2; //Finding the median
			/*
			 * int m2=(l+r-1)/2; System.out.println("M1= "+m+" M2= "+m2);
			 */
			Sorting(a,l,m);
			Sorting(a,m+1,r);
			
			Merge(a,l,m,r); //Merging the sub-arrays 
		}
	}
	
	public static void main(String[] args) {
		Sorting(a,0,a.length-1);
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		
	}

}
