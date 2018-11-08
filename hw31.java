package new1;
import java.util.Scanner;
public class hw31 {

	public static void main(String[] args) {
		
		//  HW 3.1+4.4+4.5
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("wedite stroku and press Enter");
        String stroka1 = scan.nextLine();
     	
		stroka1 = stroka1.trim();
		String  a[] = stroka1.split(" ");
		
		
		kol_vo_slov(a);
		hw31.bilsh_3(a);
		
	}
	
	//-----     methods   ----------
	public static void kol_vo_slov(String b[] ) {
	
		System.out.println("method kol work");
		
			System.out.println("слов в строке: " + b.length);
			System.out.println();
		
	}
	
	
	public static void bilsh_3(String b[] ) {
		int k=0;
		System.out.println("method 3 work");
		
		for(int j=0;j<b.length;j++) {
			
			for(int i=0;i<b.length-1;i++) {
				if(b[i].length() <b[i+1].length())  {String t  = b[i];b[i]=b[i+1];b[i+1]=t; }
				
			}
			
		}
		
		for(int j=0;j<b.length;j++) {
			System.out.println(j+" "+b[j]+"="+b[j].length());
			if (b[j].length()>3) {k=k+1;}
	}
System.out.println("слов в которых больше 3 символов:  "+k);
		
		
	}
	
	
	
}
