package SortingTechniques;

import java.util.Arrays;

public class SelectionSort {
	
	public void sort(int[] a)
	{
		
		for(int i=0;i<a.length-1;i++)
		{
			int index=i;
			int small=a[i];
			for(int j=i+1;j<a.length;j++)
			{	
				if(a[j]<a[index])
				{
					index=j;
				}
			}
			int temp=a[i];
			a[i]=a[index];
			a[index]=temp;
			
		}
		System.out.println(Arrays.toString(a));
	}
}

