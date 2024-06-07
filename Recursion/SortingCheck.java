package Recursion;

public class SortingCheck {
	public static boolean checkSort(int[] arr,int i)
	{
		if(i==arr.length-1)
			return true;
		if(arr[i]>arr[i+1])
			return false;
		else 
			return checkSort(arr,i+1);	
	}
}

