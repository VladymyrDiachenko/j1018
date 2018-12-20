public class matr1 {
	
	public static void  main (String[] args ) {
		
		int n=10,k=10,b=0;
		
	int[][] arr1= new int[n][k];
	//int[] arr2= new int[k];
	
	for (int i=0;i<k;i++) {
	for (int j=0;j<n;j++) {
		double  m = (Math.random())*100;
		b=(int)m;
		arr1[i][j]=b;
		
		System.out.print(arr1[i][k]+"  ");
		
	}
	System.out.println();
	}
	//System.out.println();
	//for (int i=0;i<k;i++) {
		
	//	System.out.print(arr2[i]+"  ");
	//}
	
	
	}
		
	}