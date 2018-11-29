import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.*;
import java.util.stream.Stream;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.SortedMap;
import java.util.stream.Stream;
import static java.nio.file.StandardOpenOption.*;


public class File_w2 {
	
	
	public static void main(String[] args) {
		
		file_clean();
		text_i();
		file_r2();
}
	
	
//	public static void file_r3() { 
//	try(FileInputStream inputStream = new FileInputStream("D:\\"+File.separator+"text1.txt")) {     
//	    String everything = IOUtils.toString(inputStream);
//	    // do something with everything string
//	}
//}
	public static void file_r2() {
		System.out.println("--r2--");
		
		 List<String> lines = new ArrayList<>();
		    Path path = Paths.get("D:\\"+File.separator+"text1.txt");
		    
		    try (Stream<String> lineStream = Files.lines(path)) {
		        
		    	// .split("\\s*(\\s)|\n");
		      
		    	lineStream.forEach(System.out::println);
		    } catch (IOException ignored) {
		    }
		 
		//    System.out.println(lines); 
		
	}
	
	
	public static void file_clean() {
		try(FileWriter writer = new FileWriter("D:"+File.separator+"text1.txt", false ))
        {
			String text ="";
	        writer.write(text); 
            
             writer.flush();
          }
        
	
	catch(IOException ex){
        
        System.out.println(ex.getMessage());
    }
		
	}
	
	
	public static void text_i() {
		Scanner sc = new Scanner(System.in);
		  System.out.println( "Vvedite text");
	      String  text = sc.nextLine();
	      if (text.equalsIgnoreCase(("exit"))) 
			{System.out.println("return inp"); text_r();
			return;}
			else
			{ text_w(text);}
	}
		
	public static void text_w(String t){
		try(FileWriter writer = new FileWriter("D:"+File.separator+"text1.txt", true ))
        {
			String text =t;
	        writer.write(text); 
            writer.append('\n');
             writer.flush();
          }
        
	
	catch(IOException ex){
        
        System.out.println(ex.getMessage());
    }
		text_i();
	}
	
	public static void text_r() {
		  try(FileReader reader = new FileReader("D:"+File.separator+"text1.txt"))
	        {
	           
	            int c,i=0;
	            while((c=reader.read())!=-1){
	                 i++;
	                System.out.print((char)c);
	            } 
	            System.out.println("kol-vo simvolov v file:"+i);
	        }
	        catch(IOException ex){
	             
	            System.out.println(ex.getMessage());
	        } 
		
		
	}
		
        }
		
	
