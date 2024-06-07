package GenericsConcept;
import java.util.ArrayList;
public class TypeSafety {
	public static String[] arrays()
	{
		String[] s=new String[4];
		s[0]="Dev";
		s[1]="Shreya";
		s[2]="Anaya";
		s[3]="Tanisha"; // We are trying to add an Integer type element even though we want it to hold only String objects
		return s;
	}
	public static ArrayList arraylist()
	{
		ArrayList L=new ArrayList();
		L.add("Dev");
		L.add("Shreya");
		L.add("Anaya");
		L.add("Anukriti"); // We are trying to add an Integer type element even though we want it to hold only String objects
		return L;
	}
	static void display(String[] a)
	{
		for(int i=0;i<4;i++)
		{
			String s=a[i];
			System.out.println(s);
		}
		System.out.println();
	}
	static void display(ArrayList T)
	{
		for(int i=0;i<4;i++)
		{
			String s=(String) T.get(i);
			System.out.println(s);
		}
	}
	public static void main(String args[])
	{
		ArrayList L=arraylist();
		String[] S=arrays();
		display(S);
		display(L);
		
	}
}
