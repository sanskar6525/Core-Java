package Recursion;
import java.util.*;
public class Subsets {
	
	public static void subsets(String res,String s)
	{
		if(s.equals(""))
			System.out.println(res);
		else
		{
			subsets(res+s.charAt(0),s.substring(1));
			subsets(res,s.substring(1));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		subsets("",s);
		

	}

}
