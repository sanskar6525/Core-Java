package SortingTechniques;

import java.util.Arrays;

public class BubbleSort {
	public void sort(int[] arr)
	{
		int l=arr.length;
		
		for(int i=0;i<l-1;i++)
		{
			for(int j=0;j<l-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
