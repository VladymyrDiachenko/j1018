import java.io.*;
import java.io.File;
import java.io.FileFilter;

 
public class file2 {
	 public static void main(String[] args) {
	        
	        try(FileWriter writer = new FileWriter("notes3.txt", false))
	        {
	           // запись всей строки
	            String text = "Hello Gold!";
	            writer.write(text);
	            // запись по символам
	            writer.append('\n');
	            writer.append('E');
	             
	            writer.flush();
	        }
	        catch(IOException ex){
	             
	            System.out.println(ex.getMessage());
	        } 
	        
	        class MyFileFilter implements 
	        
	        
	        File myFolder = new File("d://j");
	        File[] files = myFolder.listFiles();
	        
	        for (int i=0;i<files.length;i++) {
	        	
	        	System.out.println(files[i]);
	        }
	        	
	       // System.out.println(files[2]);
	        //System.out.println(files[1]);
	   
	        
	    } 
	
}