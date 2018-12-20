
public class metod_max {
	
	public static void  main (String[] args )
	{
		int n=10,k=20,b=0;
		int[] arr1= new int[n];
		for (int i=0;i<n;i++) {
			double  m = (Math.random())*100;
			b=(int)m;
			arr1[i]=b;
			System.out.print(arr1[i]+"  ");
			
		}
		
		metod_max.test(arr1,n);

		
	}
	
	public static void test(int[] arr,int m ) {
		System.out.println("metod work");
		int maxx=0,j;
		for(j=0;j<m;j++) {
		if  (arr[j]>		maxx) {			maxx=arr[j];}
		}
		
		System.out.println(maxx);
	}

}


