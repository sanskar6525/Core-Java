package MethodReferences;
//By using Lambda Expressions
class MyPrinter_2
{
	public void print_1(String s, Pass p)
	{
		String res=p.pass(s);
		System.out.println(s+" beceomes "+res+" after encryption.");
	}
	public void print_2(String s, Release p)
	{
		String res=p.release(s);
		System.out.println(s+" beceomes "+res+" after decryption.");
	}
	public static void main(String[] args)
	{
		MyPrinter_2 obj=new MyPrinter_2();
		String n="Kanan Gill";
		String s="w5B5B s=@@";
		obj.print_1(n,g->MyCase.convert(g));
		obj.print_2(s,g->MyCase.original(g));
	}
	
}
