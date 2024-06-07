package NestedClass;

//For implementing the concept of Static Nested Class

public class OuterClass_2 {

	private String Out_1="Outer_Private_NonStatic"; //private Instance variable
	
	static String Out_2="Outer_Static";  //default static  variable
	
	public void print_1()
	{
		System.out.println("Non-Static method of OuterClass_________");
		System.out.println(Out_1);
		System.out.println(Out_2+ "\n");
	}
	
	public static void print_2()    //Static method
	{
		System.out.println("Static method of OuterClass_________");
		OuterClass_2 ob=new OuterClass_2();
		System.out.println(ob.Out_1);
		System.out.println(Out_2+ "\n");
	}
	
	static class StaticNestedClass
	{
		private static String In_1="Inner_Static";  //private static  variable
		String In_2="Inner_NonStatic";   //default non-static  variable
		 
		public static void print_3()  //Static method
		{
			OuterClass_2 ob=new OuterClass_2();
			System.out.println("Static method of StaticNestedClass_________");
			System.out.println(ob.Out_1);
			System.out.println(Out_2+ "\n");
		}
		
		public void print_4()
		{
			OuterClass_2 ob=new OuterClass_2();
			System.out.println("Non-Static method of StaticNestedClass_________");
			System.out.println(ob.Out_1);
			System.out.println(Out_2 + "\n");
		}
	}
	
	public static void main(String[] args)
	{
		StaticNestedClass obj1=new StaticNestedClass();
		obj1.print_4();
		obj1.print_3();
		
		OuterClass_2 obj2=new OuterClass_2();
		obj2.print_1();
		print_2();
		
		//Accessing variables of the nested class
		System.out.println(StaticNestedClass.In_1);
		System.out.println(obj1.In_2);
	}
}
