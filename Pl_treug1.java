
import java.util.Scanner;

public class Pl_treug1 {
	
	public static void main(String[] args) {
	
		
		Double pp,ss;
		
		Scanner sc = new Scanner(System.in);
	       
		System.out.println( "Wedite st a");
        int a = sc.nextInt();
        String s = String.valueOf(a);
        Double a1 = Double.valueOf(s);
		
        System.out.println( "Wedite st b");
        int b = sc.nextInt();
        String s2 = String.valueOf(b);
        Double b1 = Double.valueOf(s2);
        
        System.out.println( "Wedite st c");
        int c = sc.nextInt();
        String s3 = String.valueOf(c);
        Double c1 = Double.valueOf(s3);
        
        System.out.println( "a="+a1+"  b="+b1+ "  c="+c1);
        
        pp=(a1+b1+c1)/2;
        System.out.println("pp="+pp);
        
        ss=Math.sqrt(((pp-a)*(pp-b)*(pp-c)*pp));
        
        System.out.println("pl="+ss);
        
        
        
        
        
		
		
	}

}
