package Bank;

import java.util.Scanner;

public class Bank3 {
	String name; //Declaring the instance variables
	double bal;
	String type;
	int id;
	static int b_id=00; //Declaring the class variables
	static double i1=10.0; 
	static double i2=8.0;
	static double i3=7.5;
	
	public Bank3(String n, double r, String t) //Parameterized Constructor to set values into the instance variables
	{
		name=n;
		bal=r;
		type=t;
		b_id++;
		id=b_id;
	}
	class details1
	{
		public void display(Bank3 obj)
		{
			System.out.println("Name: "+obj.name+"\nBank ID: "+obj.id+"\nAccount type: "+obj.type+"\nBalance Amount: "+obj.bal+"\n");
		}
	}
	static class details2
	{
		public void display(Bank3 obj)
		{
			System.out.println("Name: "+obj.name+"\nBank ID: "+obj.id+"\nAccount type: "+obj.type+"\nBalance Amount: "+obj.bal+"\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Bank3 obj1=new Bank3("Subhash", 0,"SAVINGS");
		Bank3 obj2=new Bank3("Anil", 12340,"CURRENT");
		//Bank3 obj3=new Bank3("Jack", 4567,"RECURRING");
		int ch;
		
		System.out.println("Hello "+obj1.name+",");
		System.out.println("Select the operation you want to perform :");
		System.out.println("Enter 1 to view your details ");
		ch=sc.nextInt();
		Bank3.details1 OBJ1=obj1.new details1();
		OBJ1.display(obj1);
		
		

		System.out.println("Hello "+obj2.name+",");
		System.out.println("Select the operation you want to perform :");
		System.out.println("Enter 1 to view your details ");
		ch=sc.nextInt();
		Bank3.details2 OBJ2=new Bank3.details2();
		OBJ2.display(obj2);
	}

}
