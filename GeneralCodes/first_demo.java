package GeneralCodes;
import java.util.*;
public class first_demo
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size for the word : "  );
        int n=sc.nextInt();
        char[] ch=new char[n];
        for(int i=0;i<n;i++)
        {
            ch[i]=sc.next().charAt(0);
        }
        String word=new String(ch);
        System.out.println("HEY SG, your word is :" + word);
        sc.close();
    }
}

