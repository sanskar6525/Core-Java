package Numbers;
public class Primitive {
	public static void main(String[] args)
	{
		Float f=new Float("45.87f"); //Creating a Float class object
		
		//Converting the Float class object to different primitive data types
		int i=f.intValue();
		double d=f.doubleValue();
		byte b=f.byteValue();
		short s=f.shortValue();
		long l=f.longValue();
		float F=f.floatValue();
		
		System.out.println("Value of f after converting it to int is "+i);
		System.out.println("Value of f after converting it to double is "+d);
		System.out.println("Value of f after converting it to byte is "+b);
		System.out.println("Value of f after converting it to short is "+s);
		System.out.println("Value of f after converting it to long is "+l);
		System.out.println("Value of f after converting it to float is "+F+"\n");
		
		//Comparing the Float object with arguments
		System.out.println(f.compareTo(45f));
		System.out.println(f.compareTo(F)+"\n");
		
		//Checking for equality of Float object with arguments
		System.out.println(f.equals(F));
		System.out.println(f.equals(45f));
	}
}
