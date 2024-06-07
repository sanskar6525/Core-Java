package File_Opeartions;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

public class Metadata_1 {
	public static void main(String[] args) throws IOException
	{
		Path folder_1=Paths.get("C:/Users/goelsa/Documents/Reports");
		System.out.println("Path 1 refering a folder exists: "+Files.exists(folder_1)+"\n");
		
		System.out.println("Attributes related to the folder are as follows:");
		System.out.format("Size of the folder is %d%n",Files.size(folder_1));
		System.out.format("Is this path a directory: %s%n",Files.isDirectory(folder_1));
		System.out.format("Is this path a regular file: %s%n",Files.isRegularFile(folder_1));
		System.out.format("Is this path a symbolic link: %s%n",Files.isSymbolicLink(folder_1));
		System.out.format("Is this folder hidden: %s%n",Files.isHidden(folder_1));
		System.out.format("The last modified time of the folder is:%s%n",Files.getLastModifiedTime(folder_1));
		System.out.format("The owner of the folder is:%s%n\n",Files.getOwner(folder_1));
		
		
		Path file_1=Paths.get("C:/Users/goelsa/Desktop/SampleFile.txt");
		System.out.println("Path 2 refering a file exists: "+Files.exists(file_1)+"\n");
		System.out.format("Size of the file is %d%n",Files.size(file_1));
		System.out.format("Is this path a directory: %s%n",Files.isDirectory(file_1));
		System.out.format("Is this path a regular file: %s%n",Files.isRegularFile(file_1));
		System.out.format("Is this path a symbolic link: %s%n",Files.isSymbolicLink(file_1));
		System.out.format("Is this file hidden: %s%n",Files.isHidden(file_1));
		System.out.format("The last modified time of the file is:%s%n",Files.getLastModifiedTime(file_1));
		System.out.format("The owner of the file is:%s%n",Files.getOwner(file_1));
		
		
		
		
		
	}

}
