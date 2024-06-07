package File_Opeartions;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import static java.nio.file.FileVisitResult.*;

public class VisitFile extends SimpleFileVisitor<Path>  
{
	public FileVisitResult visitFile(Path file, BasicFileAttributes attr) 
	{
	 if (attr.isSymbolicLink()) {
            System.out.format("Symbolic link: %s ", file);
        } else if (attr.isRegularFile()) {
            System.out.format("Regular file: %s ", file);
        } else {
            System.out.format("Other: %s ", file);
        }
        System.out.println("(" + attr.size() + "bytes)");
        return CONTINUE;
    }
	public FileVisitResult postVisitDirectory(Path dir,IOException exc) 
	{
		System.out.format("Directory: %s%n", dir);
		return CONTINUE;
	}
	public FileVisitResult visitFileFailed(Path file,IOException exc) 
	{
		System.err.println(exc);
		return CONTINUE;
	}
	public static void main(String[] args) throws IOException
	{
		Path folder_1=Paths.get("C:/Users/goelsa/Documents/Link_2.txt");
		BasicFileAttributes attr=Files.readAttributes(folder_1, BasicFileAttributes.class);
		VisitFile obj=new VisitFile();
		obj.visitFile(folder_1,attr);
		
	}
}
