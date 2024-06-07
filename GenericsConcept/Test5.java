package GenericsConcept;

public class Test5 extends Test4 implements Interface_1
{ //this class is both inheriting the class Test4 and also implementing the interface Interface_1 
	Test5()
	{
		super("Shantanu",89);
	}
	public void display()
	{
		System.out.println("The interface has been implemented!!");
	}
	public static void main(String[] args)
	{
		Test5 obj=new Test5();
		Test4 obj2=new Test4("Priya",56);
		
		Gen5<Test5> g1=new Gen5<>(obj); //Test5 obj satisfies the multiple bonded condition
		g1.show1();
		System.out.println(g1.getObj()+"\n");
		
		//Gen5<Test4> g2=new Gen4<>(Test4); //Test4 obj2 doesn't satisfy the multiple bonded condition because 
										  //it is an object Test4 class but it is implementing the interface 
	}
}
