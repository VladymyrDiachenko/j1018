

class Konfet{
	// '���� ����� ����� ������ �����������
	protected int ves;
	float sugar;
	String  name;
	
}
class SchokoladKonf extends Konfet{
	
	String NameOfShokolad;
	String Nuts;
	String Izum;
	
	SchokoladKonf(int v,float s, String na, String N_o_S, String Nu, String I ){
		ves=v;
		sugar = s;
		name = na;
		NameOfShokolad=N_o_S;
		Nuts=Nu;
		Izum=I;
		
	}
	void print_inf() {
		System.out.println("Konf name="+name+" "+"ves="+ves+" "+" sugar="+sugar+" NameOfS= "+NameOfShokolad+" Nuts="+Nuts+ "+"+ Izum );
	}
}

class Marmelad extends Konfet{
	boolean in_sugar;
	String color;
	
	Marmelad(int v,float s, String na,boolean su,String co){
		this.ves=v;
		sugar = s;
		name = na;
		in_sugar=su;
		color= co;
	}
	void print_inf() {
		System.out.println("Konf name="+name+" "+"ves="+ves+" sugar="+sugar+" in sugar="+in_sugar+" color="+color);
	}
} 

class Karamel extends Konfet{
	
}

class Ledenec extends Konfet{
	
}

class Gift {
	 Konfet[] sweets = new Konfet[5];
	// Gift (int v,float su, String na) {    ves=v;sugar=su;name=na;}
		 
	//	

		 
		 /*
		this.sweets = sweets;
		sweets[0].ves=1;
	}
		*/
	
}

public class NYGift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Gift g2 = new Gift(111,(float)0.77,"XZ");
		Gift g1 = new Gift();
		for (int i=0;i<5;i++) {g1.sweets[i] = new Konfet(); }
	//	g1.sweets[0].ves= M_konf_1. ;
		Marmelad M_konf_1 = new Marmelad(10,(float) 0.4,"marmelad_1",true,"white");
		Marmelad M_konf_2 = new Marmelad(12,(float) 0.44,"marmelad_2",false,"green");
		SchokoladKonf S_konf_1= new SchokoladKonf(20,(float)0.6,"shokolad_1","Milk S","Funduk","Izum" );
		SchokoladKonf S_konf_2= new SchokoladKonf(22,(float)0.61,"shokolad_2","Milk S","  ","Kuraga" );
		
		g1.sweets[0].ves = M_konf_1.ves;
		g1.sweets[1].ves = M_konf_2.ves;
		g1.sweets[2].ves = S_konf_1.ves;
		g1.sweets[3].ves = S_konf_2.ves;
		
		M_konf_1.print_inf();
		M_konf_2.print_inf();
		S_konf_1.print_inf();
		S_konf_2.print_inf();
		
		for (int i=0;i<5;i++) { System.out.println(g1.sweets[i].ves);}
		
	}
	
}
