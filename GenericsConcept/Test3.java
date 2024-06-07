package GenericsConcept;

public class Test3 implements Interface_1 //Test3 is an implementing class of the interface Interface_1
{
	public void display()
	{
		System.out.println("The interface has been implemented!!");
	}
	public static void main(String[] args)
	{
		Gen3<Interface_1> G1=new Gen3<>(null); //Interface_1 type parameter is passed to the Generic class
		G1.show();
		System.out.println(G1.getObj()+"\n");
		
		Gen3<Test3> G2=new Gen3<>(null); //a class implementing Interface_1 is passed to the Generic class as type parameter 
		G2.show();
		System.out.println(G2.getObj()+"\n");
		
		Test3 obj=new Test3();
		Gen3<Test3> G3=new Gen3<>(obj); //a class implementing Interface_1 is passed to the Generic class as type parameter 
		G3.show();
		System.out.println(G3.getObj()+"\n");
	}
}
