package File_Opeartions;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo_7 {
	public static void main(String[] args) throws IOException
	{
		Path p1=Paths.get("C:/Users/goelsa/Desktop/g.txt");
		Files.delete(p1);
		System.out.println("Text file deleted\n");
		
		Path p2=Paths.get("C:/Users/goelsa/Desktop/fdsfc.txt");
		Files.deleteIfExists(p2);
		
		
		Path p3=Paths.get("C:\\Users\\goelsa\\Desktop\\Link_3");
		Files.delete(p3);
		System.out.println("Symbolic link deleted");
		
	}

}
