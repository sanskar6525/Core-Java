package File_Opeartions;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo_6 {
	public static void main(String[] args) throws IOException
	{
		Path p1=Paths.get("C:\\Users\\\\goelsa\\\\Desktop\\\\input.txt");
		Path p2=Paths.get("C:\\Users\\\\goelsa\\\\Desktop\\\\input.txt");
		System.out.println("Paths P1 and P2 are refering to the same file: "+Files.isSameFile(p1, p2)+"\n");
		
		Path p3=Paths.get("C:\\Users\\goelsa\\Desktop");
		System.out.println("Paths P3 and P2 are refering to the same file: "+Files.isSameFile(p3, p2)+"\n");
		
		Path p4=Paths.get("C:/Users/goelsa/Desktop/Link_1.txt");
		Path p5=Paths.get("C:\\Users\\goelsa\\Documents\\outagain.txt");
		System.out.println("Paths P4 and P5 are refering to the same file: "+Files.isSameFile(p4, p5)+"\n");
		
		
		
	}

}
