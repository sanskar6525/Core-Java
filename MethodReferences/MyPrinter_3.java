package MethodReferences;

//By using Method References
class MyPrinter_3
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
		MyPrinter_3 obj=new MyPrinter_3();
		String n="Sourav Ganguly";
		String s="CIF5J s5B;I@M";
		obj.print_1(n,MyCase::convert);
		obj.print_2(s,MyCase::original);
	}
	
}
