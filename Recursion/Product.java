package Recursion;

//Product of numbers from n to 1
public class Product {
	
	public static int print(int n)
	{
		if(n==1)
			return 1;
		return n*print(n-1);
	}
	public static void main(String[] args)
	{
		System.out.println(print(3));
	}
	

}
