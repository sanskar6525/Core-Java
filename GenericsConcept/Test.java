package GenericsConcept;

public class Test implements Interface_1{
	public void display()
	{
		System.out.println("The interface has been implemented!!");
	}
	public static void main(String[] args)
	{
		Gen<String> G1=new Gen<String>("Sample1"); //To hold String object
		G1.show();
		System.out.println(G1.getObj()+"\n");
		
		Gen<Integer> G2=new Gen<Integer>(56);//To hold Integer object
		G2.show();
		System.out.println(G2.getObj()+"\n");
		
		Gen<Character> G3=new Gen<Character>('A');//To hold Character object
		G3.show();
		System.out.println(G3.getObj()+"\n");
		
		Test Obj1=new Test();
		Gen<Object> G4=new Gen<Object>(Obj1);// To hold Test class object
		G4.show();
		System.out.println(G4.getObj()+"\n");
	} 
}
