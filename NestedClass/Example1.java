package NestedClass;

public class Example1 {

	class Inner1
	{
		 void print1()
		{
			System.out.println("NonStatic Inner Class");
		}
	}
	
	static class Inner2
	{
		
		 void print1()
			{
				System.out.println("Static Inner Class");
			}
	}
	public static void ren(int s)
	{
		if(s==1) {
			class Inner3
			{
				void print1()
				{
					System.out.println("DSDASDSA");
				}
			}
			Inner3 obj=new Inner3();
			obj.print1();
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 obj=new Example1();
		Example1.Inner1 obj1=obj.new Inner1();
		obj1.print1();
		
		Example1.Inner2 obj2= new Example1.Inner2();
		obj2.print1();
		
		//Example1.Inner3 obj3=obj.new Inner3();
		ren(1);
		
		
	}

}
