import java.util.Scanner;
public class pro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("weditr stroky cifr");
        int name = sc.nextInt();
        System.out.println(name);
        String s = String.valueOf(name);
        int k = (s.length());
      //  System.out.println(s.length());
        
        
        
        int a=name,k2=1,i=k,os;
        while (i>1) {
        	k2=k2*10;
        	i--;
               }
        
       
        a = name/k2;
        os=name%k2;
              System.out.println(a);
              
      
       i=k;
        while (i>1) {
        
        	k2=k2/10;
        
            a = os/k2;
       
           os=os%k2; 
           System.out.println(a); 	
      
		i--;
        }  

	}

}
