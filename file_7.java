import java.io.File;
public class file_7 {
	   public void walk(String path) {
	        File root = new File(path);
	        File[] list = root.listFiles();
	        if (list == null)
	            return;
	        for (File f : list) {
	            if (f.isDirectory()) {
	                walk(f.getAbsolutePath());
	            //    System.out.println("Директория:" + f.getAbsoluteFile());
	            } else {
	                String m = f.getName();
	                // String m = f.getAbsolutePath();
	                if (m.endsWith(".java")) {  
	                    
	                    	System.out.println( f.getAbsoluteFile());
	                      //  System.out.println("Файлы с расширением   : " + m);
	                    
	 
	                }
	            }
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		file_7 fw = new file_7();
        fw.walk("C:/Users/");

	}

}
