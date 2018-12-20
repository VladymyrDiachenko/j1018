
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class file3 {
	public static void main(String[] args) throws IOException {

        String dirName = "d://j";

        Files.list(new File(dirName).toPath())
              //  .limit(1) 
                .forEach(path -> {
                    System.out.println(path);
                });
    }
	
	

}
