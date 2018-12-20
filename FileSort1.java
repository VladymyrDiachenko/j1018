import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//import file_1.MyFileFilter;

public class FileSort1 {

	public FileSort1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		File dir = new File("C:");
		 MyFileFilter filter = new MyFileFilter();
	    	File[] match = dir.listFiles(filter); {  for (int i=0; i<match.length;i++) {System.out.println(match[i]);  }   }
		// TODO Auto-generated method stub

	}

	class MyFileFilter implements FileFilter{
		
		public boolean accept( File pathname)
		{
			return pathname.isFile()&&pathname.getName().endsWith(".sys");
		}
}
}