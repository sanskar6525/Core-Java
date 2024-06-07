package File_Opeartions;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Directories {
	public static void main(String[] args) throws IOException
	{
		Path f1=Paths.get("C:/Users/goelsa/Desktop/Filesss/Red.txt");
		Path f2=Paths.get("C:/Users/goelsa/Documents/New_Folder/Hello_Data/temp");
		Path f3=Paths.get("C:/Users/goelsa");
		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
		for (Path name: dirs) {
		    System.err.println(name); //To display the root directory
		}
		Files.createDirectory(f1); //To create one single directory
		Files.createDirectories(f2); //To create multiple level of directories
		
		//To display the contents of a directory
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(f3)) {
		    for (Path file: stream) {
		        System.out.println(file.getFileName());
		    }
		} catch (IOException | DirectoryIteratorException x) {
		    // IOException can never be thrown by the iteration.
		    // In this snippet, it can only be thrown by newDirectoryStream.
		    System.err.println(x);
		}
		
	}
	
}
