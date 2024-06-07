package MethodReferences;

public class OuterClass {
	
	String nonStatic="Non Static outer class variable";
	static String Static="Static outer class variable";
	
	static void StaticMethod()
	{
		System.out.println("This is static outer class method");
	}
	
	void nonStaticMethod()
	{
		System.out.println("This is non static outer class method");
	}
	//Inner Class
	class InnerClass
	{
		String nonStaticInner="Non Static inner class variable";
		
		void display()
		{
			StaticMethod();
			OuterClass obj=new OuterClass();
			System.out.println("Printing from inner class method: "+nonStaticInner);
			nonStaticMethod();
		}
	}
	
	static class StaticNestedClass
	{
		String nonStaticNested="Non Static inner class variable";
		
		void display2()
		{
			StaticMethod();
			OuterClass obj=new OuterClass();
			System.out.println("Printing from inner class method: "+nonStaticNested);
			
		}
		
		static void display3()
		{
			StaticMethod();
			OuterClass obj=new OuterClass();
			System.out.println("Printing from inner class method: "+new StaticNestedClass().nonStaticNested);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass outerClassObject=new OuterClass();
		OuterClass.InnerClass innerClassObject=outerClassObject.new InnerClass();
		innerClassObject.display();
		
		StaticNestedClass staticNestedClassObject=new StaticNestedClass();
		staticNestedClassObject.display2();
		StaticNestedClass.display3();
		
	}

}
