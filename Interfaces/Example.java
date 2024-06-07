package Interfaces;

public class Example implements Demo{
	public void print()
	{
		System.out.println("Non-Default Method of Demo interface.\n");
	}
	public static void main(String[] args)
	{
		Example obj=new Example();
		obj.print();
		obj.print2();
	}
}
