
package src;
import java.util.Scanner;


public class Dl_okr1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
       
		System.out.println( "Wedite radius");
        int r = sc.nextInt();
        String s = String.valueOf(r);
        Double ra = Double.valueOf(s);
        
        
		
	Double Dl;
	Dl=2*Math.PI*ra;
	System.out.println( "Dlina okrujnosti =" + Dl); 
	
	
	
	}
}