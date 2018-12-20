import java.io.*;
import java.util.Scanner;

public class File_w1 {
	
	
	public static void main(String[] args) {
		
		text_i();
			

}
	
	public static void text_i() {
		Scanner sc = new Scanner(System.in);
		  System.out.println( "Vvedite text");
	      String  text = sc.nextLine();
	      if (text.equalsIgnoreCase(("exit"))) 
			{System.out.println("return"); return;}
			else
			{ text_w(text);}
	}
	

	
	public static void text_w(String t){
		try(FileWriter writer = new FileWriter("notes3.txt", true ))
        {
			String text =t;
	       
        
         writer.write(text); 
         //writer.append(text);
            writer.append('\n');
            //writer.append(text);
        //    text_inp();   
            writer.flush();
          }
        
	
	catch(IOException ex){
        
        System.out.println(ex.getMessage());
    }
		text_i();
	}
		//text_i();
			//}
        }
		
	
