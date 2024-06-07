package Interfaces;

interface sample2 extends Demo
{
	void print3();
	//default method of Demo interface mentioned here again
	void print2();
} 
public class SampleForExtending2 implements sample2 {
	public void print()
	{
		System.out.println("Non-Default Method of Demo interface.\n");
	}
	//default method of Demo defined again
	public void print2()
	 {
		 System.out.println("Non-Default method of sample2 Interface\n");
	 }
	public void print3()
	{
		System.out.println("Non-Default Method of sample2 interface.\n");
	}
	public static void main(String[] args)
	{
		SampleForExtending2 obj2=new SampleForExtending2();
		obj2.print();
		obj2.print2(); //Default method invoked without any error
		obj2.print3();
		
	}
}
