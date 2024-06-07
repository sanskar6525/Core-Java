package GenericsConcept;

public class Test4 extends Test2 //the class Test4 is the child class of class Test2
{
	String name;
	int marks;
	Test4(String s, int num)
	{
		super("IP", 654);
		name=s;
		marks=num;
	}
	public static void main(String[] args)
	{
		Test2 ob=new Test2("MCKV",5170); 
		Gen4<Test2> G1=new Gen4<>(ob); //Passing Test2 object as type parameter to the generic class 
		G1.show1();
		System.out.println(G1.getObj()+"\n");
		
		Test4 obj=new Test4("Shantanu",89); 
		Gen4<Test4> G2=new Gen4<>(obj);  //Passing Test4 object,which is a child class of Test2 as type parameter to the generic class 
		G2.show1();
		System.out.println(G2.getObj()+"\n");
		
	}

}
