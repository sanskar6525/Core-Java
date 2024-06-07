import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cell_Id 
{
	public static void main(String[] args) 
	{
        String input = "6385POA_ro_rdx";
        String regex = "(^[a-zA-Z0-9]++)";
    
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        
        if (matcher.find()) {
            System.out.println("Cell id: " + matcher.group());
        } 
    }
}

	