
public class matr1 {
	
	public static void  main (String[] args ) {
		
		int n=10,k=20,b=0;
		
	int[] arr1= new int[n];
	int[] arr2= new int[k];
	

	for (int i=0;i<n;i++) {
		double  m = (Math.random())*100;
		b=(int)m;
		arr1[i]=b;
		arr2[i]=b;
		arr2[i+10]=b*2;
		System.out.print(arr1[i]+"  ");
		
	}
	System.out.println();
	for (int i=0;i<k;i++) {
		
		System.out.print(arr2[i]+"  ");
	}
	
	
	}
		
	}
	
	


