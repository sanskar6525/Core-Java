package Recursion;

public class BubbleSort {
	public static int [] arr= {6,1,7,2,23,8};
	public static int count=1;
	
	public static void Sort1(int[] arr)
	{ //Simple Direct Sorting algorithm
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i:arr)
			System.out.print(i+" ");
	}
	
	public static void Sort2(int r,int c)
	{
		if(r==arr.length)
		{
			for(int i:arr)
				System.out.print(i+" ");
			return;
		}	
		else if(c==arr.length-r)
		{
			count++;
			Sort2(r+1,0);
		}
		else
		{
			if(arr[c]>arr[c+1])
			{
				int temp=arr[c];
				arr[c]=arr[c+1];
				arr[c+1]=temp;
				
			}
			count++;
			Sort2(r,++c);	
		}
			
	}
	
	public static void main(String[] arrgs)
	{
		
		Sort2(1,0);
		System.out.println("\nNumber of function calls= "+ count);
	}

}
