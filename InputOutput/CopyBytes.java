package InputOutput;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("C:\\Users\\goelsa\\Desktop\\input.txt");
            out = new FileOutputStream("C:\\\\Users\\\\goelsa\\\\Desktop\\outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
            	//System.out.println(c);
                out.write(c);
            }
            
            System.out.println("The message has been copied!");
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}