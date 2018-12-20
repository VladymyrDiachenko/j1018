import java.io.File;
//import java.util.Scanner;

public class file_8 {
	
 static void main(String[] args) {
		// TODO Auto-generated method stub
	//	  Scanner sc = new Scanner(System.in);
	//	  System.out.println( "Vvedite path");
	//      String  a = sc.nextLine();
		
		 // определяем объект для каталога
        File dir = new File("C:");
        // если объект представляет каталог
        if(dir.isDirectory())
        {
            // получаем все вложенные объекты в каталоге
            for(File directory_1 : dir.listFiles()){
            	
            	//  if(directory_1.isDirectory()){
                
              //  System.out.println(directory_1.getName() + "  \t folder");
            
             
                 if(directory_1.isDirectory()){
                     //tory_1.getName();
                 
                	  if (n.endsWith(".sys")) {  
  	                    
	                    	System.out.println( directory_1.getAbsoluteFile());
	                      //  System.out.println("Файлы с расширением   : " + m);
	                    
	 
	                }
                 //    if (directory_1.e)
                  //   System.out.println(directory_1.getName() + " file");
                 }
             }
        }

	}

}
