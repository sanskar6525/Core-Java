package Sorting_Searching;

public class BinarySearch {
	public static int search(int[] arr,int n, int s, int e)
	{
		if(s>e)
			return -1;
		
		int m=s+(e-s)/2;
		if(arr[m]==n)
			return m;
		else if(n<arr[m])
			return search(arr,n,s,m-1);
		else if(n>arr[m])
			return search(arr,n,m+1,e);
		
		return -1;
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,55,65,567,1000};
		System.out.println(search(arr,55,0,arr.length-1));
	}
}
