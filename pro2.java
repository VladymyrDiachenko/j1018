import java.util.Scanner;
public class pro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("qqqq");
        int name = sc.nextInt();
        System.out.println(name);
        //int b =6;
        String s = String.valueOf(name);
        int k = (s.length());
        System.out.println(s.length());
        
        
        
        int a=name,k2=1,i=k,os;
        while (i>1) {
        	k2=k2*10;
        	i--;
        //	System.out.println("k2="+k2);
        }
        
       // k2=int(Math.pow(10, (k-1)));
        a = name/k2;
        os=name%k2;
              System.out.println("k2="+k2+"  a="+a+ " os="+os);
              
              
       /*
      k2=k2/10;
      a = os/k2;
      os=os%k2;
    System.out.println("k2="+k2+"  a2="+a+ " os="+os);
     */
       i=k;
        while (i>1) {
        //	if (k>0) {k2=k2/10;}
        	k2=k2/10;
        //	if (k2>0) {a = os/k2;}
            a = os/k2;
         //  if(os>10) {os=os%k2;}
           os=os%k2; 
           System.out.println("k2="+k2+"  a3="+a+ " os="+os); 	
        /*	
       a = name%10;
      name = name/k2;
      k2=k2/10;
        */
    //            System.out.println("a="+a);
		i--;
        }  

	}

}
