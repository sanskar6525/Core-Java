package InputOutput;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("C:\\Users\\goelsa\\Desktop\\input.txt");
            outputStream = new FileWriter("C:\\Users\\goelsa\\Desktop\\outagain.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
            	//System.out.println(c);
                outputStream.write(c);
            }
            outputStream.write(90);
            outputStream.write("\nHelo sji");
            System.out.println("The message has been copied!");
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
        	finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}