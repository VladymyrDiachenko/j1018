import java.io.*;
public class file_3 {

	public file_3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String pathname = "c:";
		String Str = new String("Добро пожаловать на ProgLang.su");
	      String SubStr1 = new String("Prog");
	     
	      String filename = pathname.getPath();
	   	    int i = filename.lastIndexOf('.');
	   	    if ( i>0 && i<filename.length()-1 ) {
	   	    	System.out.println(filename.substring(i+1).toLowerCase());
	   	        return filename.substring(i+1).toLowerCase();
	   	    }
	   	    return "";
	    
	   //   System.out.print("Найденный последний индекс: ");
	   //   System.out.println(Str.lastIndexOf(SubStr1));
		
		// TODO Auto-generated method stub

	}
	/*
	   String getExtension(File pathname) {
   	    String filename = pathname.getPath();
   	    int i = filename.lastIndexOf('.');
   	    if ( i>0 && i<filename.length()-1 ) {
   	    	System.out.println(filename.substring(i+1).toLowerCase());
   	        return filename.substring(i+1).toLowerCase();
   	    }
   	    return "";
   	    */
     }
}
 
