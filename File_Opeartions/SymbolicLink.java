package File_Opeartions;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SymbolicLink {
	
	public static void main(String[] args) throws IOException
	{
		Path f1=Paths.get("C:/Users/goelsa/Documents/SoftLink_1.txt");
		Path f2=Paths.get("C:/Users/goelsa/Desktop/input.txt");
		Path f3=Paths.get("C:/Users/goelsa/Documents/HardLink_1.txt");
		
		Files.createSymbolicLink(f1, f2);  //Soft Link
		
		Files.createLink(f3, f2);  //Hard Link
		
		Path res=Files.readSymbolicLink(f1);
		System.out.println("Target of the soft link is as follows: "+res);
	}

}
