package StringsAndCharacters;

public class StringBuilderClass {
	public static void details(StringBuilder s)
	{
		System.out.println("Length="+s.length());
		System.out.println("Capacity="+s.capacity()+"\n");
	}
	public static void main(String[] args)
	{
		String s="Hey there!";
		CharSequence r="Great Wall!";
		int c=12;
		StringBuilder b1=new StringBuilder();
		details(b1);
		
		StringBuilder b2=new StringBuilder(r);
		details(b2);
		
		StringBuilder b3=new StringBuilder(c);
		details(b3);
		
		StringBuilder b4=new StringBuilder(s);
		details(b4);
		
		System.out.println("StringBuilder before decreasing length: "+b2);
		details(b2);
		int L=b2.length();
		b2.setLength(L-3);
		System.out.println("\nStringBuilder after decreasing length: "+b2);
		details(b2);
		
		b2.setLength(L+27);
		System.out.println("\nStringBuilder after increasing length: "+b2);
		details(b2);
		
	}
	
}
