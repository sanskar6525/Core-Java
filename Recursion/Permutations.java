package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
	static List<String> L=new ArrayList<>();
	
	public static void p(String a,String s)
	{
		if(s.length()==0)
		{ 
			L.add(a);
			//System.out.println(a);
		}
		else if(a.length()==0)
			p(s.substring(0,1),s.substring(1,s.length()));
		else 
		{
			int l=s.length();
			int loop=a.length();
			for(int i=0;i<=loop;i++)
			{
				String m=a.substring(0,i)+s.charAt(0)+a.substring(i,loop);
				p(m,s.substring(1,l));
			}  
		}
	}
	public static void main(String[] args) 
	{
		//TODO Auto-generated method stub
		String s="abc";
		p("",s);
		System.out.println(L);
	}
}



