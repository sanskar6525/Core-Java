package StringsAndCharacters;
import java.util.*;
public class Manipulation {
	String sen;
	String num1;
	String num2;
	
	public void input_sen(Scanner ob)
	{
		ob.nextLine();
		System.out.print("Enter the sentence: ");
		sen=ob.nextLine();
	}
	public void input_num(Scanner ob)
	{
		System.out.println("Enter the first number: ");
		num1=ob.next();
		System.out.println("Number of digits in the given number "+num1+" is "+num1.length()+"\n");
		System.out.println("Enter the second number: ");
		num2=ob.next();
		System.out.println("Number of digits in the given number "+num2+" is "+num2.length()+"\n");
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Manipulation obj=new Manipulation();
		System.out.println("Enter 1 to pass a sentence \nEnter 2 to pass a number as String\n");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			obj.input_sen(sc);
			Sentences o2=new Sentences();
			o2.senten(obj.sen);
			break;
		case 2:
			obj.input_num(sc);
			StringNumbers o1=new StringNumbers();
			o1.numbers(obj.num1, obj.num2);
			break;
		}
		
		
	}
}
