
class Thread2 implements Runnable {
      
     
    public void run(){
          
        System.out.println(" started  "+ Thread.currentThread().getName());
        try{
        	for(int i=0;i<3000;i=i+300) {
        		System.out.println(i+" "+Thread.currentThread().getName());
            Thread.sleep(i);}
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.println(" finished  "+ Thread.currentThread().getName());
        
    }
} 

// ----------------   w3schools.com

public class Thrd_4 {
	public static void main(String[] args) {
		//----------------
//		int j=4,n=10,c=20,b=0;
//		int[][] arr1= new int[n][j];
//		for (int k=0;k<n;k++){
//			System.out.println();
//		for (int i=0;i<j;i++) {
//			double  m = (Math.random())*100;
//			b=(int)m;
//			arr1[k][i]=b;
//			System.out.print(arr1[k][i]+"  ");
//		}
//		
//		//----------------
        
        System.out.println("Main start");
        Thread Thread2 = new Thread(new Thread2(),"ThreadRunnable");
        Thread2.start();
      
        System.out.println("current: "+Thread.currentThread().getName());
   
       new  Thrd_new().start();
       System.out.println("current: "+Thread.currentThread().getName());
    }
	static class Thrd_new extends Thread {
		Thrd_new(){super ("Extend  "); 		}
        public void run() {   
        	System.out.println(" start"+Thread.currentThread().getName());
        	try{
            	for(int i=0;i<3000;i=i+300) {
            		System.out.println(i+" "+Thread.currentThread().getName());
                Thread.sleep(i);}
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
        	//System.out.println("current: "+Thread.currentThread().getName());
        	System.out.println(" finished  "+ Thread.currentThread().getName());          
        }
}
	
	public static void matr_prn (){
		int j=4,n=10,c=20,b=0;
		int[][] arr1= new int[n][j];
		for (int k=0;k<n;k++){
			System.out.println();
		for (int i=0;i<j;i++) {
			double  m = (Math.random())*100;
			b=(int)m;
			arr1[k][i]=b;
			System.out.print(arr1[k][i]+"  ");
		}
		
	} }
	
} 
