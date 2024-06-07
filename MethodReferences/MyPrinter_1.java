package MethodReferences;

//By using Interface Reference

interface Pass
{
	public String pass(String s);
}
interface Release
{
	public String release(String s);
}
class MyCase
{
	public static String convert(String s)
	{
		String rs="";
		for(int i=0;i<s.length();i++)
		{
			int a=(int)s.charAt(i);
			if((a<=84)&&(a!=32))
			{
				a=a+44;
			}
			else if((a>84)&&(a!=32))
			{
				a=a-44;
			}
			char ch=(char)a;
			rs=rs+ch;
		}
		return rs;
	}
	public static String original(String s)
	{
		String rs="";
		for(int i=0;i<s.length();i++)
		{
			int a=(int)s.charAt(i);
			if((a<=84)&&(a!=32))
			{
				a=a+44;
			}
			else if((a>84)&&(a!=32))
			{
				a=a-44;
			}
			char ch=(char)a;
			rs=rs+ch;
		}
		return rs;
	}
	
	
}
class MyPrinter_1
{
	public void print(String s, Pass p)
	{
		String res=p.pass(s);
		System.out.println(s+" beceomes "+res+" after encryption.");
	}
	public void print(String s, Release p)
	{
		String res=p.release(s);
		System.out.println(s+" beceomes "+res+" after decryption.");
	}
	public static void main(String[] args)
	{
		MyPrinter_1 obj=new MyPrinter_1();
		String n="Suraj Pal";
		String s="IF5> |5@";
		obj.print(n,new Pass(){
			public String pass(String g)
			{
				return MyCase.convert(g);
			}});
		obj.print(s,new Release() {
			public String release(String s)
			{
				return MyCase.original(s);
			}
		});
	}
	
}
