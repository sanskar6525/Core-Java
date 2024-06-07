package File_Opeartions;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo_5 {
	public static void main(String[] args)
	{
		Path p1=Paths.get("C:\\Users\\\\goelsa\\\\Desktop\\\\input.txt");
		boolean f=Files.exists(p1);
		boolean f_=!Files.exists(p1);
		boolean g=Files.notExists(p1);
		boolean read=Files.isReadable(p1);
		boolean write=Files.isWritable(p1);
		boolean exe=Files.isExecutable(p1);
		System.out.println("Path 1 exists: "+f);
		System.out.println("Negation of Path 1 exists: "+f_);
		System.out.println("Path 1 does not exist: "+g);
		System.out.println("Is File 1 readable: "+read);
		System.out.println("Is File 1 writable: "+write);
		System.out.println("Is File 1 executable: "+exe);
		
		
		Path p2=Paths.get("home/sans/files/");
		f=Files.exists(p2);
		f_=!Files.exists(p2);
		g=Files.notExists(p2);
		System.out.println("\nPath 2 exists: "+f);
		System.out.println("Negation of Path 2 exists: "+f_);
		System.out.println("Path 2 does not exist: "+g);

	}

}
