package GeneralCodes;
public class User implements Bank
{
	int amt;
	String name="";
	String ac_type="";
	int pr=0;
	int t=0;
	int r2=0;
	public void rate(String u)
	{
		int rate;
		if(u=="SAVINGS")
			 rate=12;
		else if(u=="CURRENT")
			 rate=10;
		else
			 rate=8;
		r2=rate;
	}
	
	public int rt()
	{
		int rt=r2;
		return rt;
		
	}

	public User(String n, String a,int p,int ti)
	{
		name=n;
		ac_type=a;
		pr=p;
		t=ti;
	}
	public void display_1()
	{
		amt=pr +(pr*r2/100);
		System.out.println("Name of the customer is : " + name);
		System.out.println("Interest rate :" + r2);
		System.out.println("Amount :" + amt+"\n");
		
	}
	
	public void display_2()
	{
		int r=rt();
		amt=pr +(pr*r/100);
		System.out.println("Name of the customer is : " + name);
		System.out.println("Interest rate :" + r);
		System.out.println("Amount :" + amt);
	}
	public static void main(String args[])
	{
		User obj1=new User("Sanskar", "SAVINGS", 4500, 2);
		User obj2=new User("Rohan", "CURRENT", 12345, 7);
		obj1.rate("SAVINGS");
		obj2.rate("CURRENT");
		obj1.display_1();
		obj2.display_2();
		
	}
}