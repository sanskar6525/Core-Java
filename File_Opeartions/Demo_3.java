package File_Opeartions;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo_3 {
	public static void main(String[] args)
	        throws IOException
	    {
			Path p1=Paths.get("sans");
			System.out.println("Path 1 is: "+p1);
			Path p2=Paths.get("gupt");
			System.out.println("Path 2 is: "+p2+"\n");
			
			Path p1_to_p2=p1.relativize(p2);
			System.out.println("Path 1 relative to path 2 is: "+p1_to_p2+"\n");
			Path p2_to_p1=p2.relativize(p1);
			System.out.println("Path 2 relative to path 1 is: "+p2_to_p1+"\n");
			
			Path p3 = Paths.get("home");
			System.out.println("Path 3 is: "+p3);
			Path p4 = Paths.get("home/sally/bar");
			System.out.println("Path 4 is: "+p4+"\n");
		
			Path p3_to_p4 = p3.relativize(p4);
			System.out.println("Path 3 relative to path 4 is: "+p3_to_p4+"\n");
			Path p4_to_p3 = p4.relativize(p3);
			System.out.println("Path 4 relative to path 3 is: "+p4_to_p3+"\n");

		
	    }

}