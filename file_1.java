import java.io.File;
import java.io.FilenameFilter;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class file_1 {

	
		
	
	
	
	public static void main(String[] args)  throws IOException  {
		
		
		String nam = "t123";
		File file = new File(nam); 
		if (file.exists()) {System.out.println("123 !");}
		else {
		file.mkdir();
		System.out.println("===");
		}
		
		file = new File("res.csv");
		file.createNewFile();
		
	//	System.out.println(file.getAbsolutePath());
		// ----------
		//  file.getAbsolutePath()
		file = new File("c:");
		String ext = ".txt";
		
		if (file.isDirectory()) {
			
			File[] listFiles = file.listFiles( );
			
			for (File file2 : listFiles) {
				if (file.isDirectory()) {
					//call this method one more time    testMethod(file)
				}
			}
			System.out.println("listFiles");
			System.out.println(listFiles);
		}
		
		
		
		
		// TODO Auto-generated method stub
	//	if (file.exists()) {System.out.println("123 !");}
		
		  // определяем объект для каталога
        File dir = new File("C:"+File.separator);
        // если объект представляет каталог
        if(dir.isDirectory())
        {
            // получаем все вложенные объекты в каталоге
            for(File directory_1 : dir.listFiles()){
             
                 if(directory_1.isDirectory()){
                     
                     System.out.println(directory_1.getName() + "  \t folder");
                 }
                 else{
                 //    if (directory_1.e)
                     System.out.println(directory_1.getName() + " file");
                 }
             }
        }
        
//        MyFileFilter filter = new MyFileFilter();
	//    	File[] match = dir.listFiles(filter); {  for (int i=0; i<match.length;i++) {System.out.println(match[i]);  }   }
			
		
				
	}

	class MyFileFilter implements FileFilter{
		
		public boolean accept( File pathname)
		{
			return pathname.isFile()&&pathname.getName().endsWith(".sys");
		}  
	}
}
