package Inheritance;

public class apple extends Fruits{
	double price;
	public apple(double r,int e)
	{
		super(e); //Invoking the superclass constructor
		price=r;
	}
	public void print()
	{
		super.print();  //Invoking the superclass method
		System.out.println("Price from sub class is: "+this.price);
	}
	public static void main(String[] args)
	{
		apple  obj=new apple(122.09,23);
		obj.print();
	}
}