package InputOutput;

import java.io.*;
import java.util.Scanner;

public class ScanXan {
    public static void main(String[] args) throws IOException {

        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("C:\\Users\\goelsa\\Desktop\\input.txt")));
            s.useDelimiter(",\\s*");
            //System.out.println(s.next());
            while (s.hasNext()) {
               System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}
