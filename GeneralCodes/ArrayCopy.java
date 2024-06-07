package GeneralCodes;
import java.util.*;
public class ArrayCopy {
	static int n,sr,de,nu;
	public static String[] inputarr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter source array size : ");
		int n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLine();
		}
		System.out.println();
		return arr;
	}
	public static void input(int l)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the position in source array to start copying from : ");
		sr=sc.nextInt();
		if((sr>l)||(sr<0))
		{
			System.out.println("Enter valid source index position!!");
			input(l);
		}
		System.out.println("Enter the number of elements to copy: ");
		nu=sc.nextInt();
		if(nu>l)
		{
			System.out.println("Enter valid number!!");
			input(l);
		}
		System.out.println("Enter the position in destination array to start copying into: ");
		de=sc.nextInt();
		
	}
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String[] copyFrom =inputarr();
	        int l=copyFrom.length;
	        input(l);
	        String[] copyTo = new String[nu];
	        System.arraycopy(copyFrom, sr, copyTo, de, nu);
	        for(String w:copyTo)
	        {
	        	System.out.print(w+"\t");
	        }
	      
	    }
}
