
public class matr4 {
	
public static void  main (String[] args ) {
		
		int n=5,k=5,b=0;
		
	int[][] arr1= new int[n][k];
	//int[] arr2= new int[k];
	
	for (int i=0;i<k;i++) {
	for (int j=0;j<n;j++) {
		//double  m = (Math.random())*100;
		//b=(int)m;
		arr1[j][i]=j+i;
		
		System.out.print(arr1[j][i]+"  ");
		
	}
	System.out.println();
	}
	//System.out.println();
	//for (int i=0;i<k;i++) {
		
	//	System.out.print(arr2[i]+"  ");
	//}
	
	
	}

}
