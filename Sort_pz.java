
public class Sort_pz {
	
	public static void  main (String[] args ) {
		int n=10;
		int tmp=0;
		
		int[] mas1= new int[n];
		
		for (int i=0;i<10;i++) {
						  double  m = (Math.random())*100;
					int b=(int)m;
					mas1[i] = b;
					System.out.print(mas1[i]+ "  ");
					
	}
		
		System.out.println();
		
		for (int i =0;i<10;i++) {
			
			
			for (int j =0;j<9;j++) {
		
			if (mas1[ j]>mas1[j+1]) {
				tmp = mas1[j+1];
				mas1[j+1]=mas1[j];
				mas1[j]=tmp;
			
			}
		
				}
			
			
			
			
		} 
		
		for (int i =0;i<10;i++) { System.out.print(mas1[i]+ "  "); }

}
}

