package File_Opeartions;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo_2 {
    public static void main(String[] args)
        throws IOException
    {
    	
    	Path path1=Paths.get("/home/files/..");
    	path1=path1.normalize();
    	System.out.println("Path 1 is: "+path1);
    	System.out.format("%s%n\n",path1.toUri());
    	
    	Path path2=Paths.get("/home/files/.");
    	path2=path2.normalize();
    	System.out.println("Path 2 is: "+path2);
    	System.out.format("%s%n\n",path2.toUri());
    	
    	
    	Path path3 = Paths.get("C:\\home\\joe\\foo");
    	System.out.println("Path 3 is: "+path3);
    	System.out.format("Joined path: %s%n", path3.resolve("bar\sgsd"));
    	
    	
    	
    }
}