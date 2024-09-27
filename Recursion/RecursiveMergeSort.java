package Recursion;

import java.util.Arrays;

public class RecursiveMergeSort extends ArrayExample {
	
	
	
	public static int[]  mergeSort(int [] a)
	{
		if(a.length==1)
			return a;
		
		int mid=(a.length)/2;
		
		int[] a1=Arrays.copyOfRange(a, 0, mid);
		int[] a2=Arrays.copyOfRange(a,mid, a.length);
		
		a1=mergeSort(a1);
		a2=mergeSort(a2);
		
		
		
		return merge(a1,a2);
	}
	
	public static int[] merge(int[] a1,int[] a2)
	{
		int[] m=new int[a1.length+a2.length];
		int i=0,j=0,k=0;
		
		while((i<a1.length) && (j<a2.length))
		{
			if(a1[i]<a2[j])
			{
				m[k]=a1[i];
				k++;
				i++;
			}
				
			else
			{
				m[k]=a2[j];
				k++;
				j++;
			}
		}
		while(i<a1.length)
		{
			m[k]=a1[i];
			k++;
			i++;
		}
		while(j<a2.length)
		{
			m[k]=a2[j];
			k++;
			j++;
		}
		return m;
	}
	
	public static void main(String[] args)
	{
		int[] a= { 4,3,2,1};
		int[] b=mergeSort(a);
		
		printArray(b);
		
	}

}
