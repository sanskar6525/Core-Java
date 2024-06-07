package Recursion;
import java.util.*;
public class Fibo {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the position: ");
		int n=sc.nextInt();
		System.out.println(fibo(n));
	}
	public static int fibo(int s)
	{
		if(s==0)
			return 0;
		else if(s==1)
			return 1;
		return fibo(s-1)+fibo(s-2);
	}
}
