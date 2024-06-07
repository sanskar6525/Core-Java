package StringsAndCharacters;
import java.util.*;
public class Sentences {
	public void senten(String s)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(s+"\n");
		System.out.println("Length of the sentence is: "+s.length()+"\n");
		System.out.print("Enter start index for substring: ");
		int start=sc.nextInt();
		System.out.print("Enter the stop index for substring: ");
		int stop=sc.nextInt();
		String res=s.substring(start,stop+1);
		System.out.println("\nResult of substring is: "+res+"\n");
		String arr[]=s.split(" "); //This will just split the entire string at places where there is a space
		System.out.println("The sentence has the following words in it: ");
		for(String r:arr)
		{
			System.out.println(r);
		}
		System.out.println("\nSentence in Upper Case:\n"+s.toUpperCase()+"\n");
		System.out.println("Sentence in Lower Case:\n"+s.toLowerCase()+"\n");
		System.out.println("Enter the character sequence you want to replace in the sentence: ");
		sc.nextLine();
		String g=sc.nextLine();
		System.out.println("Enter the character sequence to which you want to replace in the sentence: ");
		String h=sc.nextLine();
		System.out.println("\n"+"Sentence with the replaced sequence is: \n"+s.replace(g,h));
	}
}
