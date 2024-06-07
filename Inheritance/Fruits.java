package Inheritance;

public class Fruits {
	int price;
	public Fruits(int r)
	{
		price=r;
	}
	public void print()
	{
		System.out.println("Price from super class is: "+this.price);
	}
	public static void main(String[] args)
	{
		Fruits obj=new Fruits(23);	
	}
}
