package File_Opeartions;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Small_Files {
	public static Path f1,f2;
	public static ArrayList<Character> chars=new ArrayList<>();
	
	public byte[] read(Path p) throws IOException
	{
		byte[] file=Files.readAllBytes(p);
		for(byte s:file)
		{
			char ch=(char)s;
			chars.add(ch);
			System.out.print(s+" - "+ch+"\n");
		}
		return file;
	}
	public void read2(Path p) throws IOException
	{
		byte[] file=Files.readAllBytes(p);
		for(byte s:file)
		{
			System.out.print(s+"\t");
		}
	}
	public void write(Path p, byte[] b) throws IOException
	{
		Files.write(p,b);
	}
	public static void main(String[] args)throws IOException
	{
		Small_Files obj=new Small_Files();
		Charset charset = Charset.forName("UTF-8");
		f1=Paths.get("C:/Users/goelsa/Desktop/input.txt");
		byte[] copy=obj.read(f1); //To store all the bytes from the file into an array
		
		f2=Paths.get("C:/Users/goelsa/Desktop/numbers.txt");
		obj.write(f2,copy); //To write all the bytes into the file
		
		//Files.write(f2,chars, charset, StandardOpenOption.WRITE);
		obj.read2(f2);
	}

}
