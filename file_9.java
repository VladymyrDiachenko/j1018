import java.io.File;
import java.util.Scanner;
public class file_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  Scanner sc = new Scanner(System.in);
			  System.out.println( "Vvedite path");
		      String  a = sc.nextLine();
		      test_file(a);
	}

	public static void test_file (String d ) { 
		int count = 0;
		  File dir = new File(d);
        if(dir.isDirectory())
        {
            for(File directory_1 : dir.listFiles()){
             
                 if(directory_1.isDirectory()){
                     
                	 String path_1 = directory_1.getAbsolutePath();
                	 test_file(path_1);
                    System.out.println(directory_1.getName() + "  \t folder");
                 }
                 else{
                 	 String n = directory_1.getName(); 
                	   if (n.endsWith(".log")) {  
   	                    
	                    //	System.out.print( n+" ");
	                    	System.out.println( directory_1.getAbsoluteFile());
	                    
	 
	                } 
                 
                 }
             }
        }
		
	}
	
}
