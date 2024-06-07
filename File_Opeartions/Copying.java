package File_Opeartions;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;

public class Copying {
	public static void main(String[] args) throws IOException
	{
		Path source=Paths.get("C:\\Users\\goelsa\\Desktop\\input.txt");
		Path destination=Paths.get("C:\\Users\\goelsa\\Desktop\\input_copy.txt");
		Files.copy(source, destination,REPLACE_EXISTING);
	
		Path p1=Paths.get("C:\\Users\\goelsa\\Desktop\\numbers.txt"); //numbers.txt file already exists
		Files.copy(source,p1,REPLACE_EXISTING);
		
		Path p2=Paths.get("C://Users//goelsa//Documents//Reports");
		Path p3=Paths.get("C://Users//goelsa//Documents//Reports_Copy_1");
		Files.copy(p2,p3,REPLACE_EXISTING); //Here neither the contents nor the attributes of the source folder are copied
		
		Path p4=Paths.get("C://Users//goelsa//Documents//Reports_Copy_2");
		Files.copy(p2,p4,COPY_ATTRIBUTES, REPLACE_EXISTING); //Here the attributes of the source folder are copied, but not the contents
		
		
	}

}
