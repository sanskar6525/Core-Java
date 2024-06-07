package GeneralCodes;
import java.util.*;

import Recursion.ArrayExample;
public class ReArrange
{
	public static int sum(int[] a,int[] b,int N)
	{
		int sum=0;
		for(int i=0;i<N;i++)
		{
			sum=sum+a[i]+b[i];
		}
		return sum;
	}
	
	public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
    }
	
	public static void find(int[] a,int[] b,int n,int s)
	{
		int na[]=new int[n];
		int nb[]=new int[n];
		int k=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]+b[j]==s)
				{
					na[k]=a[i];
					nb[k]=b[j];
					k++;
				}
			}
		}
		System.out.println();
		printArray(na);
		System.out.println();
		printArray(nb);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test!=0)
		{
			int N=sc.nextInt();
			int a[]=new int[N];
			int b[]=new int[N];
			for(int i=0;i<N;i++)
			{
				a[i]=sc.nextInt();
			}
			
			for(int i=0;i<N;i++)
			{
				b[i]=sc.nextInt();
			}
			int sum=sum(a,b,N);
			if(sum%N!=0)
				System.out.println("-1");
			else
			{
				sum=sum/N;
				find(a,b,N,sum);
			}
			 test--;
		}
	}
}
