package NestedClass;

//For implementing the concept of NonStatic Nested Class(Inner Classes)

class OuterClass_1   
{
	private String Out_1="Outer_Private_NonStatic"; //Instance private variable
	
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
		OuterClass_1 ob=new OuterClass_1();
		System.out.println(ob.Out_1);
		System.out.println(Out_2+ "\n");
	}
	
	class NonStatic  //InnerClass (NonStatic Nested Class)
	{
		private static String In_1="Inner_Static";  //private static  variable
		String In_2="Inner_NonStatic";   //default non-static  variable
		
		public static void print_3()  //Static method
		{
			OuterClass_1 ob=new OuterClass_1();
			System.out.println("Static method of NonStaticNestedClass_________");
			System.out.println(ob.Out_1);
			System.out.println(Out_2+ "\n");
		}
		
		public void print_4()
		{
			System.out.println("Non-Static method of NonStaticNestedClass_________");
			System.out.println(Out_1);
			System.out.println(Out_2 + "\n");
		}
	}
	
	public static void main(String[] args)
	{
		OuterClass_1 obj1=new OuterClass_1();
		obj1.print_1();
		print_2();
		
		OuterClass_1.NonStatic obj2=obj1.new NonStatic();  //Creation of OuterClass Object is necessary for the inner-class object to access outer-class members
		obj2.print_4();
		NonStatic.print_3();
		
		//Accessing variables of the nested class
		System.out.println(NonStatic.In_1);
		System.out.println(obj2.In_2);
		
		
	}
}