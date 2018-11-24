import java.io.File;
import java.util.Scanner;
public class file_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//11		
		  Scanner sc = new Scanner(System.in);
			  System.out.println( "Vvedite path");
		      String  a = sc.nextLine();
		
		
        File dir = new File(a);
       
        if(dir.isDirectory())
        {
            for(File directory_1 : dir.listFiles()){
             
                 if(directory_1.isDirectory()){
                     
                  //   System.out.println(directory_1.getName() + "  \t folder");
                 }
                 else{
                 	 String n = directory_1.getName(); 
                	   if (n.endsWith(".log")) {  
   	                    
	                    	System.out.print( n+" ");
	                    	//System.out.println( directory_1.getAbsoluteFile());
	                    
	 
	                } 
                 
                 }
             }
        }
	}

	public static void test_file (File d ) { 
		
		
	}
	
}
