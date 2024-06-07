package Interfaces;
interface sample extends Demo
{
	void print3();
	//default method of Demo interface not mentioned
}
public class SampleForExtending implements sample {
	public void print()
	{
		System.out.println("Non-Default Method of Demo interface.\n");
	}
	public void print3()
	{
		System.out.println("Non-Default Method of sample interface.\n");
	}
	public static void main(String[] args)
	{
		SampleForExtending obj=new SampleForExtending();
		obj.print();
		obj.print2(); //Default method invoked without any error
		obj.print3();
		
	}

}
