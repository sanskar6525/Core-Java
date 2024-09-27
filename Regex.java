import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex
{
    public static void main(String[] args) 
	{
        String input = "filterList:FIXED:";
        String regex = ":[A-Z]+:";
    
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find())
        {
            String t=matcher.group();
            System.out.println(t);
        }
        
        // if (matcher.find()) {
        //     System.out.println("Cell id: " + matcher.group());
        // } 
    }
}