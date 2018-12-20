
public class thrd_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 int j=4,n=100,c=20,b=0;
			
			int[][] arr1= new int[n][j];
		
		Thread t2=new Thread() {
	          public void run()  {
	        	  
	        	  long startTime = System.currentTimeMillis();
	              thrd_5.test2(arr1,n,0);
	              try {
	            	 Thread.sleep(1);
	            	  
	              }
	              catch(Exception e)
	              {System.out.println("Exception e");}
	           // t2.sleep(1000);
	              long workTime = System.currentTimeMillis()-startTime;
	        	  System.out.println("workTime t1="+workTime);
	        	  
	        	  
	        } 
			        };
			        
			        Thread t1=new Thread() {
				          public void run()  {
				        	  
				        	  long startTime = System.currentTimeMillis();
				              thrd_5.test2(arr1,n,1);
				              try {
				            	 Thread.sleep(1);
				            	  
				              }
				              catch(Exception e)
				              {System.out.println("Exception e");}
				          
				              long workTime = System.currentTimeMillis()-startTime;
				        	  System.out.println("workTime t3="+workTime);
				        	  
				        	  
				        } 
						        };
						        
						        Thread t3=new Thread() {
							          public void run()  {
							        	  
							        	  long startTime = System.currentTimeMillis();
							              thrd_5.test2(arr1,n,2);
							              try {
							            	 Thread.sleep(1);
							            	  
							              }
							              catch(Exception e)
							              {System.out.println("Exception e");}
							         
							              long workTime = System.currentTimeMillis()-startTime;
							        	  System.out.println("workTime t3="+workTime);
							        	  
							        	  
							        } 
									        };
									        
									        Thread t4=new Thread() {
										          public void run()  {
										        	  
										        	  long startTime = System.currentTimeMillis();
										              thrd_5.test2(arr1,n,3);
										              try {
										            	 Thread.sleep(1);
										            	  
										              }
										              catch(Exception e)
										              {System.out.println("Exception e");}
										           // t2.sleep(1000);
										              long workTime = System.currentTimeMillis()-startTime;
										        	  System.out.println("workTime t4="+workTime);
										        	  
										        	  
										        } 
												        };
			        
	        
														//------------ matr_genera
														for (int k=0;k<n;k++){
															System.out.println();
														for (int i=0;i<j;i++) {
															double  m = (Math.random())*10000;
															b=(int)m;
															arr1[k][i]=b;
														//	System.out.print(arr1[k][i]+"  ");
														}}
														//------------
														System.out.println();											
												        
			t1.start();        
	        t2.start();
	        t3.start();
	        t4.start();
	    	//thrd_5.test2(arr1,n,j-1);
	    	thrd_5.test1(arr1,n,j-1);
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
		//--------
		 try {
        	 Thread.sleep(1);
        	  
          }
          catch(Exception e)
          {System.out.println("Exception e");}
		//-----------------
		}
		//}
		System.out.println(maxx);
	}
	
public static void test1(int[][] arr,int m,int o ) {
	long startTime = System.currentTimeMillis();
		System.out.println();
		System.out.print("metod 1 work, max = ");
		
		
		
	//	int[][] arr1= new int[m][o];
	
	//	int c=o;
		int maxx=0;
		for(int j=0;j<m;j++) {
		for (int i=0;i<o;i++) {
		if  (arr[j][i]>		maxx) {			maxx=arr[j][i];}
		//--------
		 try {
        	 Thread.sleep(1);
        	  
          }
          catch(Exception e)
          {System.out.println("Exception e");}
		//-----------------
		}
		}
		System.out.println(maxx);
		long workTime = System.currentTimeMillis()-startTime;
  	  System.out.println("workTime single Search="+workTime);
	}
	}


