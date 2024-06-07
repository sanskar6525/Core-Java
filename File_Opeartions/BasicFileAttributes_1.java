package File_Opeartions;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributes_1 {
	public static void main(String[] args) throws IOException
	{
		Path folder_1=Paths.get("C:/Users/goelsa/Documents/Reports");
		BasicFileAttributes attr=Files.readAttributes(folder_1, BasicFileAttributes.class);
		
		System.out.println("creationTime: " + attr.creationTime());
		System.out.println("lastAccessTime: " + attr.lastAccessTime());
		System.out.println("lastModifiedTime: " + attr.lastModifiedTime());

		System.out.println("isDirectory: " + attr.isDirectory());
		System.out.println("isOther: " + attr.isOther());
		System.out.println("isRegularFile: " + attr.isRegularFile());
		System.out.println("isSymbolicLink: " + attr.isSymbolicLink());
		System.out.println("size: " + attr.size()+"\n");
		
		
		
		System.out.println("Changed time stamps");
		long current=System.currentTimeMillis();
		FileTime f=FileTime.fromMillis(current);
		Files.setLastModifiedTime(folder_1,f);
		System.out.println("lastModifiedTime: " + attr.lastModifiedTime());
	}

}
