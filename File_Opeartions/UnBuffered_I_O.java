package File_Opeartions;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class UnBuffered_I_O {
	public static void read(Path p) 
	{
		try (InputStream in = Files.newInputStream(p);
			    BufferedReader reader =new BufferedReader(new InputStreamReader(in))) {
			    String line = null;
			    while ((line = reader.readLine()) != null) {
			        System.out.println(line);
			    }
			} catch (IOException x) {
			    System.err.println(x);
			}
	}
	public static void write(Path p) 
	{
		String s = "Hello World! ";
	    byte data[] = s.getBytes();
	    try (OutputStream out = new BufferedOutputStream(
	      Files.newOutputStream(p, StandardOpenOption.CREATE, StandardOpenOption.APPEND))) {
	      out.write(data, 0, data.length);
	    } catch (IOException x) {
	      System.err.println(x);
	    }
	}
	public static void main(String[] args)
	{
		Path f1=Paths.get("C:/Users/goelsa/Desktop/input.txt");
		Path f2=Paths.get("C:/Users/goelsa/Desktop/output1.txt");
		read(f1);
		write(f2);
		System.out.println("\nContents of file after writing in it:");
		read(f2);
	}
}
