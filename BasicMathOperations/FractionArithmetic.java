package BasicMathOperations;
/*Purpose of this package is to perform certain basic mathematical operations, which might become handy in certain other
complex problems*/

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class FractionArithmetic 
{
	//To perform fractional addition and subtraction
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		
		int numerator=0,denominator=1;
		
		Pattern pattern=Pattern.compile("([+-]?[\\d]+)/(\\d+)");
		Matcher matcher=pattern.matcher(s);
		
		while(matcher.find())
		{
			int num=Integer.parseInt(matcher.group(1));
			int den=Integer.parseInt(matcher.group(2));
			//System.out.print(num+"\t"+den);
			numerator=(numerator*den)+(denominator*num);
			denominator*=den;
			
			int gcd=HCF.HCF1(Math.abs(numerator),denominator);
			//System.out.print("\t\t"+numerator+"\t"+denominator+"\tGCD="+gcd+"\n");
			
			numerator/=gcd;
			denominator/=gcd;
		}
		
		System.out.println(numerator+"/"+denominator);

	}

}
