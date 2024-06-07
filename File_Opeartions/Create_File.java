package File_Opeartions;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Create_File {
	public static void main(String[] args)throws IOException
	{
		Path f1=Paths.get("C:/Users/goelsa/Desktop/SAMPLE.txt");
		//Files.createFile(f1);
		
		
		Path f2=Paths.get("C:/Users/goelsa/Desktop/SAMPLE_3");
		Path tempFile = Files.createTempFile(null, ".myapp");
		    System.out.format("The temporary file" + "has been created: %s%n", tempFile);
	}
}

