package StringBuffer_Class;

public class LargeString {
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer();
		sb.append("weMakeDevs");
		System.out.println(sb);
		String s=sb.toString();
		System.out.println(s);
		s=s+"g";
		System.out.println(s);
		
		
	}
}
