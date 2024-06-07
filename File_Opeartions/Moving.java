package File_Opeartions;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;

public class Moving {
	public static void main(String[] args) throws IOException
	{
		Path source=Paths.get("C://Users//goelsa//Desktop//input_1.txt");
		Path target=Paths.get("C://Users//goelsa//Documents//input_1.txt");
		Files.move(source, target);
	}

}
