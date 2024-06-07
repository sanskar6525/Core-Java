package File_Opeartions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Buffered_I_O {
	public static void read(Path p) throws IOException
	{
		Charset charset = Charset.forName("US-ASCII");
		BufferedReader reader = Files.newBufferedReader(p, charset);
		String line=null;
		while((line=reader.readLine())!=null) //Reading one line at a time until the end of text file
		{
			System.out.println(line);
		}
	}
	public static void main(String[] args)throws IOException
	{
		Path f1=Paths.get("C:/Users/goelsa/Desktop/input.txt");
		Path f2=Paths.get("C:/Users/goelsa/Desktop/output1.txt");
		Charset charset = Charset.forName("UTF-8");
		BufferedReader reader = Files.newBufferedReader(f1, charset);
		BufferedWriter writer=Files.newBufferedWriter(f2,charset,StandardOpenOption.CREATE);
		//BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\goelsa\\Desktop\\output.txt"));
		System.out.println("Displaying text of file 1: \n");
		String line=null;
		while((line=reader.readLine())!=null) //Reading one line at a time until the end of text file
		{
			System.out.println(line);
		}
		reader.close();
	    writer.write("ddhdf",0,5);
		System.out.println("\nDisplaying text of file 2 after writing in it: \n");
		read(f2);
	}
}
