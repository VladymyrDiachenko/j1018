import java.util.Scanner;
public class zv1 {
	public static void  main (String[] args ) {
		
		String  ch1="*";
		int i,	j=0,n=1;
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
        
        
	// 5	
		
	for (i=0;i<m;i++)
	{
		for (j=0;j<n;) { 
			System.out.print(ch1);
				j++;
		}
		System.out.println();
n++;
	}
	
	
	//System.out.println("--");
	 n=n-2;	
	for (i=0;i<m;i++)
	{
		for (j=0;j<n;) { 
			System.out.print(ch1);
				j++;
		}
		System.out.println();
n--;
	}
	
	
	
		
		
	}
	
	

}
