package StringsAndCharacters;
import java.util.*;
public class StringNumbers {
	public void numbers(String n1,String n2)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 if there are decimal numbers\nEnter 2 if numbers are intergers(Without any decimal)");
		int c=sc.nextInt();
		switch(c)
		{
		case 1:
			double num1=Double.parseDouble(n1);
			double num2=Double.parseDouble(n2);
			System.out.println("Result after addition is: "+(num1+num2));
			System.out.println("Result after subtraction is: "+(num1-num2));
			System.out.println("Result after division is: "+(num1/num2));
			System.out.println("Result after multiplication is: "+(num1*num2));
			String p=Double.toString(num1);
			String q=Double.toString(num2);
			System.out.println("Result after concatenation is: "+p.concat(q)+"\n");
			break;
		case 2:
			int nu1=Integer.parseInt(n1);
			int nu2=Integer.parseInt(n2);
			System.out.println("Result after addition is: "+(nu1+nu2));
			System.out.println("Result after subtraction is: "+(nu1-nu2));
			System.out.println("Result after division is: "+(nu1/nu2));
			System.out.println("Result after multiplication is: "+(nu1*nu2));
			String r=Integer.toString(nu1);
			String s=Integer.toString(nu2);
			System.out.println("Result after concatenation is: "+r.concat(s)+"\n");
			break;
		}
		
		
	}

}
