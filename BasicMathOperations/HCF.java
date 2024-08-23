package BasicMathOperations;
/*Purpose of this package is to perform certain basic mathematical operations, which might become handy in certain other
complex problems*/

import java.util.Scanner;

/*Purpose of this package is to perform certain basic mathematical operations, which might become handy in certain other
complex problems*/

public class HCF //To find LCM of two numbers
{
	//HCF by the direct process of going through all the factors of both the numbers one by one
	public static int HCF1(int a1,int a2)
	{
		int max=Math.max(a1, a2);
		int res=1;
		int i;
		for(i=1;i<=max;i++)
		{
			if(a1%i==0 && a2%i==0)
			{
				res=Math.max(res, i);
			}
		}
		return res;
	}
	
	//HCF by the Euclidean algorithm
	public static int HCF2(int a1,int a2)
	{
		int min=(a1<a2)?a1:a2;
		int max=(a1>a2)?a1:a2;
		
		int r=min;
		while(max%min!=0)
		{
			r=max%min;
			max=min;
			min=r;
		}
		return r;
	}
	
	//Solving by recursion
	
	//HCF using a variant of the Euclidean algorithm, the subtraction method
	public static int HCF3(int a1,int a2)
	{
		if(a1==0)
			return a2;
		
		if(a2==0)
			return a1;
		
		if(a1==a2)
			return a1;
		
		if(a1>a2)
			return HCF2(a1-a2,a2);
		
		return HCF2(a1,a2-a1);
	}
	
	//HCF using the recursive version of the Euclidean algorithm
	public static int HCF4(int a1,int a2)
	{
		if(a2==0)
			return a1;
		
		return HCF4(a2,a1%a2);
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		
		System.out.println("HCF of the two numbers through the direct process is: "+HCF1(a1,a2));
		
		System.out.println("HCF of the two numbers through the Euclidean algorithm is: "+HCF2(a1,a2));
		
		System.out.println("HCF of the two numbers through the subtraction method is: "+HCF3(a1,a2));
		
		System.out.println("HCF of the two numbers through the recursive version of Euclidean algorithm is: "+HCF4(a1,a2));
		
	}

}
