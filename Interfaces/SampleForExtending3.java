package Interfaces;

interface sample3 extends Demo
{
	//default method of Demo interface is overridden now
	default void print2()
	 {
		 System.out.println("Default method of sample3 Interface\n");
	 }
} 
public class SampleForExtending3 implements sample3{
	public void print()
	{
		System.out.println("Non-Default Method of Demo interface.\n");
	}
	public void print3()
	{
		System.out.println("Non-Default Method of sample2 interface.\n");
	}
	public static void main(String[] args)
	{
		SampleForExtending3 obj3=new SampleForExtending3();
		obj3.print();
		obj3.print2(); //Default method invoked without any error
		obj3.print3();
		
	}
}
