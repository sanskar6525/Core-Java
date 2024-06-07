package GenericsConcept;

public class Test2 
{
	String school;
	int ID;
	Test2(String s,int id)
	{
		school=s;
		ID=id;
	}
	public static void main(String[] args)
	{
		Gen2<String> ob1=new Gen2<String>();
		ob1.show();
		Gen2 ob2=new Gen2();
		ob2.show();
		//ob2=ob1;
	}
	
}
