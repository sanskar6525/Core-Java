package StringsAndCharacters;
import java.util.*;
public class StringBuilderOperations {
	public static void append(Scanner ob,StringBuilder s, StringBuilderOperations obj)
	{
		System.out.println("String before any kind of appending: "+s);
		details(s);
		System.out.print("Enter the character to append to the last: ");
		char ch=ob.nextLine().charAt(0);
		System.out.println();
		System.out.println("Appended String: "+s.append(ch));
		System.out.println("Details of Appended String: ");
		details(s);
		
		
		System.out.println("Appended String: "+s.append(obj));
		System.out.println("Details of Appended String: ");
		details(s);
		
		char c[]= {'!','@','#','$'};
		System.out.println("Appended String: "+s.append(c));
		System.out.println("Details of Appended String: ");
		details(s);
		
		
		System.out.println("Appended String: "+s.append(". That's all."));
		System.out.println("Details of Appended String: ");
		details(s);
	}
	public static void details(StringBuilder q)
	{
		System.out.println("Length= "+q.length());
		System.out.println("Capacity= "+q.capacity()+"\n");
	}
	public static void insert(Scanner ob,StringBuilder s)
	{
		System.out.println("Enter the offset index position, where you want to insert: ");
		int pos=ob.nextInt();
		ob.nextLine();
		System.out.println("Enter what to insert: ");
		String w=ob.nextLine();
		
		System.out.println("String after insertion: "+s.insert(pos, w));
		System.out.println("Details of edited String: ");
		details(s);
	}
	public static void delete(Scanner ob,StringBuilder s)
	{
		System.out.println("Enter the START position to delete: ");
		int p1=ob.nextInt();
		System.out.println("Enter the END position to delete: ");
		int p2=ob.nextInt();
		System.out.println("String after deletion: "+s.delete(p1, p2));
		System.out.println("Details of edited String: ");
		details(s);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		StringBuilderOperations obj=new StringBuilderOperations();
		StringBuilder S=new StringBuilder("Hey there using Strings");
		append(sc,S,obj);
		insert(sc,S);
		delete(sc,S);
		System.out.println("String in reverse order: "+S.reverse()+"\n");
	}
}
