package GeneralCodes;
import java.util.*;
public class UnderstandingInput {
	public static void main(String[] args)
	{
		
		
		
		/*String input = "Hello World!";
        Scanner scanner = new Scanner(input);

        while (scanner.hasNext()) {
            String token = scanner.next();
            System.out.println(token);
        }

        System.out.println("No more tokens available.");
        scanner.close();*/
        
        Scanner sc=new Scanner(System.in);
        int i=1;
        boolean b=sc.hasNext();
        while (sc.hasNext()) {
            String token = sc.next();
            System.out.println("Token: " + token);
        }

        System.out.println("No more tokens available.");

        System.out.println("End");
        
        /*Scanner sc=new Scanner(System.in);
		System.out.println("1"+sc.hasNext());
		String s=sc.next();
		//sc.next();
		System.out.println(s);
		System.out.println(sc.hasNext());
		System.out.println("Sda");
		System.out.println(sc.hasNext());
		s=sc.next();
		//sc.next();
		System.out.println(s);
		//sc.next();
		System.out.println("Sda");
		System.out.println(sc.hasNext());
		s=sc.next();
		//sc.next();
		System.out.println(s);
		System.out.println(sc.hasNext());
		s=sc.next();
		//sc.next();
		System.out.println(s);
		System.out.println(sc.hasNext());*/
	}
}
