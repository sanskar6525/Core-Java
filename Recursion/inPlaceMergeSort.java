package Recursion;

import java.util.Arrays;

public class inPlaceMergeSort extends ArrayExample {
	public static int a[] = { 12, 11, 13, 5, 6, 7 };
	
	public static void Merge(int [] a,int l, int m,int r)
	{
		//Size of the two sub-arrays
		int s1=l;
		int s2=m+1;

		int k = l;
	
        //Initial index of merged sub-array array
        
        while (s1 <=m && s2 <=r) {
            if (a[s1] < a[s2]) {
                a[k] = a[s1];
                s1++;
            }
            else {
                a[k] = a[s2];
                s2++;
            }
            k++;
        }
        
        //Copy remaining elements of L[] if any
        while (s1 <=m) {
            a[k] = a[s1];
            s1++;
            k++;
        }
 
        //Copy remaining elements of R[] if any
        while (s2 <=r) {
            a[k] = a[s2];
            s2++;
            k++;
        }
	}
	public static void Sorting(int[] a,int l,int r)
	{
		if(l<r)
		{
			int m=(l+(r-1))/2; //Finding the median
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
