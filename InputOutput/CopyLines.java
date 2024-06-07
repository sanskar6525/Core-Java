package InputOutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class CopyLines {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("C:\\Users\\goelsa\\Desktop\\input.txt"));
            outputStream = new PrintWriter(new FileWriter("C:\\Users\\\\goelsa\\\\Desktop\\outagain.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
                System.out.println(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}