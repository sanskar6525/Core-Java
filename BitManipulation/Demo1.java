package BitManipulation;
import java.util.*;
public class Demo1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		String num=sc.nextLine();
		int size=num.length();
		int number=Integer.valueOf(num);
		System.out.println(number);
		int res=(1<<size-1);
		System.out.println(res);
		
	}

}
