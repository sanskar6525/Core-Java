package File_Opeartions;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo_4 {
	
	public static void main(String[] args)
	        throws IOException
	    {
			Path path = Paths.get("home/sans/files/demoS");
			for (Path name: path) {
			    System.out.println(name);
			}
			Path p1=Paths.get("home/sans/files/");
			Path p2=Paths.get("home");
			Path p3=Paths.get("demoS");
			
			if(path.equals(p1))
			{
				System.out.println("Paths are same!\n");
			}
			
			if(path.startsWith(p2))
			{
				System.out.println("Paths start from the same place\n");
			}
			
			if(path.endsWith(p3))
			{
				System.out.println("Paths end up at the same place\n");
			}
	    }

}
