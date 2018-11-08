package HW5;
import java.util.Scanner;
// test 32 33

class Books {
int Book_id; // 
String Autors;
String Nazva;
String Pizdatelstvo; // 
int GodIsGod; //
int Strannico;
int Price1;
String Perepl; 


void po_avtoru (String str1){
	
    boolean b;
    b = ((Autors).equals(str1));
	
	if (b==true) {System.out.println(Book_id+" "+Nazva+" "+Autors);}
	
}

void po_godu(int god_v) {
	if (GodIsGod>god_v) {System.out.println(Book_id+" "+Nazva+" "+GodIsGod+" "+Autors);}
}



}





public class books1 {

	public static void main(String[] args) {
		
		  Books[] abc = new Books [10];
		  for(int i=0;i<10;i++) {abc[i]= new Books();abc[i].Book_id=i+100;}
		
		  
		  String str2 ="Duma";
		  abc[0].Autors = "Duma";
		  abc[1].Autors = "Pushkin";
		  abc[2].Autors = "StrugAB";
		  abc[3].Autors = "Duma";
		  abc[4].Autors = "Pelevin";
		  abc[5].Autors = "Stivenson";
		  abc[6].Autors = "Stivenson";
		  abc[7].Autors = "Lukianenko";
		  abc[8].Autors = "Remark";
		  abc[9].Autors = "Gashek";
		  
		  abc[0].Nazva="3 M";
		  abc[1].Nazva="R&L";
		  abc[2].Nazva="Ulitka na s";
		  abc[3].Nazva="10 let s";
		  abc[4].Nazva="Pokolenie P";
		  abc[5].Nazva="Ostrov S";
		  abc[6].Nazva="Chern Strela";
		  abc[7].Nazva="Chernovik";
		  abc[8].Nazva="3 T";
		  abc[9].Nazva="Shweyk";
		  
		  for (int i=0;i<10;i++) {
			  //abc[i].GodIsGod = i;
				  double  m = (Math.random())*100;
					int b=(int)m;
					//arr1[i]=b;
				  abc[i].GodIsGod = (1900+b);
				  abc[i].Strannico=b+19;
				  abc[i].Price1=b*3;
				  if(b>50) {abc[i].Perepl="Hard";}else {abc[i].Perepl="Soft";}
				
		  
				  System.out.println("Book_id="+abc[i].Book_id+" "+"Autors= "+abc[i].Autors+" "+"GodIsd="+abc[i].GodIsGod+
						  " "+"Nazv="+abc[i].Nazva+" "+"Price="+ abc[i].Price1+" "+"Perepl="+abc[i].Perepl);
		    
		   
		   
		
		  }
		  System.out.println("vvedite zadannogo avtora ");
				  Scanner sc = new Scanner(System.in);
			      String  avt = sc.nextLine();
			     
			      
			      for (int i=0;i<10;i++) {
			    	  abc[i].po_avtoru(avt);
			    	
			      }
			      
			      System.out.println("vvedite god");
				  Scanner sc1 = new Scanner(System.in);
			      int  god = sc1.nextInt();
			      
			      for (int i=0;i<10;i++) {
			    	
			    	  abc[i].po_godu(god);
			      }
			      
	}
	
}
