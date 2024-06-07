package Recursion;

public class SelectionSort {
	public static int [] arr= {6,1,7,2,23,8};
	public static int count=1;
	
	public static void SSort1(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int low=arr[i];
			int pos=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<low)
				{
					low=arr[j];
					pos=j;
				}
			}
			int temp=arr[i];
			arr[i]=low;
			arr[pos]=temp;
		}
		
		for(int i:arr)
			System.out.print(i+" ");
	}
	public static void SSort2(int r,int c)
	{
		if(r==arr.length)
		{
			for(int i:arr)
				System.out.print(i+" ");
			return; 
		}
		else if(c==arr.length)
			SSort2(r+1,r+1+1);
		else
		{

			if(arr[c]>arr[r])
			{
				int temp=arr[r];
				arr[r]=arr[c];
				arr[c]=temp;
			}
			SSort2(r,c+1);
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SSort2(0,1);
	}

}
