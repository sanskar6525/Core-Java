package ExceptionHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Example {
	 private List<Integer> list;
	 private static final int SIZE = 10;

	public Example() {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(new Integer(i));
        }
    }
	
	 public void writeList() throws IOException
	 {
	   PrintWriter out = null;
	   out = new PrintWriter(new FileWriter("OutFile.txt"));
	    for (int i = 0; i <SIZE; i++) {
	        out.println("Value at: " + i + " = " + list.get(i));
	    }
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		 

	}

}
