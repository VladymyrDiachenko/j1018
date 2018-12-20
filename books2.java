import java.util.Scanner;
public class books1 {
	

	
	public static void  main (String[] args ) {
		
		inf_book n1 = new inf_book();
		
	  inf_book[] mas1 = new inf_book[10];
	  
	  for (int i =0;i<10;i++)
	  {  mas1[i] = new inf_book();
		  
	  }
	  
	//  mas1[0].id_book  = 2 ;
	//  n1.id_book = 2;
	//  mas1[].avtor = {"P","P","P","P","P","P","P","P","P","P" };
	  mas1[0].avtor = "Duma";
	  mas1[1].avtor = "Pushkin";
	  mas1[2].avtor = "StrugAB";
	  mas1[3].avtor = "Duma";
	  mas1[4].avtor = "Pelevin";
	  mas1[5].avtor = "Stivenson";
	  mas1[6].avtor = "Stivenson";
	  mas1[7].avtor = "Lukianenko";
	  mas1[8].avtor = "Remark";
	  mas1[9].avtor = "Gashek";
	  
	  mas1[0].nazv = " 3 M";
	  mas1[1].nazv = " R&L";
	  mas1[2].nazv = "Ulitka na ";
	  mas1[3].nazv = "10 let s";
	  mas1[4].nazv = "Pokolenie P";
	  mas1[5].nazv = "Ostrov S";
	  mas1[6].nazv = "Chern Strela";
	  mas1[7].nazv = "Chernovik";
	  mas1[8].nazv = "3 T";
	  mas1[9].nazv = " Shweyk";
	  
	  
	  
	  
	  
	  for (int i=0;i<10;i++) {
	  mas1[i].id_book = i;
		  double  m = (Math.random())*100;
			int b=(int)m;
			//arr1[i]=b;
		  mas1[i].god = (1900+b);
	//	 mas1[i].avtor = "wer";
		  
		  System.out.print("id = "+ mas1[i].id_book+" god vipuska "+ mas1[i].god+" "+
		  mas1[i].avtor+" "+ mas1[i].nazv		  );
		  System.out.println();
			  }
	  //============
	  Scanner sc = new Scanner(System.in);
	  System.out.println( "Wedite Avtora");
      String  a = sc.nextLine();
    //  System.out.println( a);
      
      boolean b;
        
    for  (int i=0;i<10;i++) {
    	b = ((mas1[i].avtor).equals(a));
    	if(b==true) {
    		//System.out.println(mas1[i].nazv );
    		 System.out.print("id = "+ mas1[i].id_book+" god vipuska "+ mas1[i].god+" "+
   				  mas1[i].avtor+" "+ mas1[i].nazv		  );
   		 System.out.println();
    		
    	}
    }
      
    System.out.println( "Wedite god");
    int g = sc.nextInt();
    for  (int i=0;i<10;i++) {
    	if (mas1[i].god>g) {
    		//System.out.println( );
    		 System.out.print("id = "+ mas1[i].id_book+" god vipuska "+ mas1[i].god+" "+
    				  mas1[i].avtor+" "+ mas1[i].nazv		  );
    		 System.out.println();
    		 
    	}
    	
    }
    
	  
	  
	  
  }
  
  
 
	
}

	
 class inf_book {
	 public   int id_book;
	public int god;
	public int kol_vo_str;
	public int price;
	 public   String avtor,nazv,pereplet;
  
 
 
	 public static void out1 ( int id, int god1)
		{
			System.out.print("id = "+ id +" god vipuska "+ god1  );
			 System.out.println();
			
		}  
	 
	 }
	  
	  
 	

