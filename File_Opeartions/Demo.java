package File_Opeartions;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo {
    public static void main(String[] args)
        throws IOException
    {
        Path path1 = (Path)Paths.get("/usr", "local", "bin");
        System.out.println("Path 1 is: "+path1);
        
        Path path2 = Paths.get("/temp/demo");
        System.out.println("Path 2 is: "+path2);
        
        Path path3 = FileSystems.getDefault().getPath("/users/sans");
        System.out.println("Path 3 is: "+path3);
        
        Path path4 = Paths.get(URI.create("file:///Users/sans/Demo.java"));
        System.out.println("Path 4 is: "+path4+"\n");
        
        Path path5=Paths.get("C:users/sans/goelsa/demos/demo1");
        System.out.println("Path 5 is: "+path5+"\n");
        System.out.format("toString: %s%n", path5.toString());
        System.out.format("getFileName: %s%n", path5.getFileName());
        System.out.format("getName(0): %s%n", path5.getName(0));
        System.out.format("getName(1): %s%n", path5.getName(1));
        System.out.format("getName(2): %s%n", path5.getName(2));
        System.out.format("getName(3): %s%n", path5.getName(3));
        System.out.format("getName(4): %s%n", path5.getName(4));
        System.out.format("getNameCount: %d%n", path5.getNameCount());
        System.out.format("subpath(0,5): %s%n", path5.subpath(0,5));
        System.out.format("getParent: %s%n", path5.getParent());
        System.out.format("getRoot: %s%n", path5.getRoot());
     
        Path path6=Paths.get("/home/./joe/foo");
        System.out.println("\nPath 6 (with redundancy): "+path6);
        System.out.println("Path 6 (without redundancy): "+path6.normalize()+"\n");
        
        Path path7=Paths.get("/home/sally/../joe/foo");
        System.out.println("Path 7 (with redundancy): "+path7);
        System.out.println("Path 7 (without redundancy): "+path7.normalize()+"\n");
    }
}
