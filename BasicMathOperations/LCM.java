package BasicMathOperations;
/*Purpose of this package is to perform certain basic mathematical operations, which might become handy in certain other
complex problems*/

import java.util.*;

public class LCM //To find LCM of two numbers
{
	//LCM is also known as Least Common Denominator (LCD)
	
	//LCM by the direct process of going through all the multiples of both the numbers one by one
	public static int LCM1(int a1,int a2) 
	{
		
		int start=(a1>a2)?a1:a2; 
		int i;
		for(i=start;i<=a1*a2;i++)
		{
			if(i%a1==0 && i%a2==0)
				break;
		}
		return i;
		
	}
	
	//LCM using the HCF of the two numbers
	public static int LCM2(int a1,int a2)
	{
		int hcf=HCF.HCF2(a1, a2);
		return (a1*a2)/hcf;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		
		System.out.println("LCM of the two numbers through the direct process is: "+LCM1(a1,a2));
		
		System.out.println("LCM of the two numbers using HCF of the twp numbers is : "+LCM2(a1,a2));
		

	}

}
