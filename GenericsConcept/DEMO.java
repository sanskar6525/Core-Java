package GenericsConcept;
public class DEMO 
{
	public static void main(String[] args)
	{
		Object obj1=new Object();
		Integer num1=new Integer(12);
		obj1=num1;
		System.out.println(obj1+"\n");
		
		Integer num2=new Integer(0);
		num2=num1;
		System.out.println(num2);
		
	}
}
