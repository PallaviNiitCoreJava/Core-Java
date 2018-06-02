package nioexample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NIOExample {

    public static void main(String[] args) throws IOException {
        Path src=Paths.get("E:\\Pallavi java\\NIOExample\\Demo.txt");
        Path dest=Paths.get("E:\\Pallavi_New\\Demo.txt");
        
        //Files.copy(src, dest);
        //Path one=Paths.get("E:\\Pallavi_Next");
        //Files.createDirectory(one);
        //Files.copy(src, dest,StandardCopyOption.REPLACE_EXISTING);
        Files.move(src, dest, StandardCopyOption.REPLACE_EXISTING);
        //Files.move(dest, src , StandardCopyOption.REPLACE_EXISTING,StandardCopyOption.COPY_ATTRIBUTES);
        
    }
    
}
