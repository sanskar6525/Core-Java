package Numbers;

public class Integers {
	public static void main(String[] args)
	{
		String s1="45"; //String representation 
		String s2="0b100";
		String s3="0x16A";
		String s4="013";
		
		Integer a=Integer.decode(s1); //Decodes string in all forms(decimal,hexadecimal,binary or octal) into an Integer object
		System.out.println(s1+" which is in decimal form has the equivalent as "+a+"\n");
		
		Integer c=Integer.decode(s3); //Returns integer representation of string value only in decimals
		System.out.println(s3+" which is in hexadecimal form has the decimal equivalent as "+c+"\n");
		
		Integer d=Integer.decode(s4); //Returns integer representation of string value only in decimals
		System.out.println(s4+" which is in octal form has the decimal equivalent as "+d+"\n");
		
		String s5="A";
		int e=Integer.parseInt(s5,16); //Returns integer of the string representation of decimal,binary,octal or hexadecimal by setting the radix accordingly
		System.out.println(s5+" which is in hexadecimal form has the decimal equivalent as "+e+"\n");
		
		String s6="11";
		int f=Integer.parseInt(s6,8); 
		System.out.println(s6+" which is in octal form has the decimal equivalent as "+f+"\n");
			
		String t=c.toString(); //Returns the string representation of an Integer object
		System.out.println("String represemtation of "+c+"is"+t+"\n"); 
		
		String p=Integer.toString(456); //Returns the string representation of an integer
		System.out.println("String represemtation of 456 is"+p+"\n"); 
		
		Integer g=Integer.valueOf(456);//Returns the Integer object of an integer
		System.out.println(g+"\n");
		
	}
}