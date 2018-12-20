
//public class thrd_matr1 {
	
	
	class Thread3 implements Runnable {
	   public void run(){
	          
	        System.out.println(" started  "+ Thread.currentThread().getName());
	        try{
	        	int i =5;
	        	//for(int i=0;i<3000;i=i+300) {
	        		System.out.println(i+" "+Thread.currentThread().getName());	            Thread.sleep(i);
	        		//}
	        }
	        catch(InterruptedException e){
	            System.out.println("Thread has been interrupted");
	        }
	        System.out.println(" finished  "+ Thread.currentThread().getName());
	        
	    }
	}
	public class thrd_matr1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Thread Thread3 = new Thread(new Thread3(),"ThreadRunnable1");
//        Thread3.start();
//      
//        System.out.println("current: "+Thread.currentThread().getName());
		
		int j=4,n=10,c=20,b=0;
		
		int[][] arr1= new int[n][j];
		//------------ matr_genera
		for (int k=0;k<n;k++){
			System.out.println();
		for (int i=0;i<j;i++) {
			double  m = (Math.random())*100;
			b=(int)m;
			arr1[k][i]=b;
			System.out.print(arr1[k][i]+"  ");
		
		//------------
			
			Thread Thread4 = new Thread(new Thread3(),"ThreadRunnable1");
	        Thread4.start();
	        System.out.println("current: "+Thread.currentThread().getName());
			
	        Thread Thread5 = new Thread(new Thread3(),"ThreadRunnable2");
	        Thread5.start();
	      
	        System.out.println("current: "+Thread.currentThread().getName());
		
//		for (int k=0;k<n;k++){
//			System.out.println();
//		for (int i=0;i<j;i++) {
//			double  m = (Math.random())*100;
//			b=(int)m;
//			arr1[k][i]=b;
//			System.out.print(arr1[k][i]+"  ");
//			
//		}
//	}
			
	//	thrd_matr1.matr_genera();
	//	thrd_matr1.test(arr1,n,j);
//		thrd_matr1.test2(arr1,n,j);
		
//		for (int k=0;k<n;k++){
//			System.out.println();
//		for (int i=0;i<j;i++) {
//			
//			System.out.print(arr1[k][i]+"  ");
		}
		}
	}

	public static int[][]  matr_genera() {
		int j=4,n=10,c=20,b=0;
		int[][] arr1= new int[n][j];
		for (int k=0;k<n;k++){
			System.out.println();
		for (int i=0;i<j;i++) {
			double  m = (Math.random())*100;
			b=(int)m;
			arr1[k][i]=b;
			System.out.print(arr1[k][i]+"  ");
		// return arr1;
		}
	}
	//	thrd_matr1.test2(arr1,n,j);
		 return arr1;	
	}
	
	public static void test(int[][] arr,int m,int o ) {
		
		System.out.println();
		System.out.print("metod work, max = ");
		
	//	int[][] arr1= new int[m][o];
	
	//	int c=o;
		int maxx=0,j,c=o;
		for(j=0;j<m;j++) {
		for (int i=0;i<o;i++) {
		if  (arr[j][i]>		maxx) {			maxx=arr[j][i];}
		}
		}
		System.out.println(maxx);
	}
	
	public static void test2(int[][] arr,int m,int o ) {
		
		System.out.println();
		System.out.print("metod 2 work, max = ");
		
	//	int[][] arr1= new int[m][o];
	
	//	int c=o;
		int maxx=0,i=o;
		for(int j=0;j<m;j++) {
		//for (int i=0;i<o;i++) {
		if  (arr[j][i]>		maxx) {			maxx=arr[j][i];}
		}
		//}
		System.out.println(maxx);
	}
	
}
