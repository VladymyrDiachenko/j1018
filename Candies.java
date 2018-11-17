package HW6_NY_Candies;



class Konfet{
	// '���� ����� ����� ������ �����������
	int ves;
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
		ves=v;
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
	// sweets[0].ves=1;
/*	
	public Gift(Konfet[] sweets) {
		this.sweets = sweets;
		sweets[0].ves=1;
	}
*/		
	}


public class Candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	sweets[0].ves=1;
		Gift g1 = new Gift();
		g1.sweets[0] = new Konfet();
		g1.sweets[0].ves=222;
		Marmelad M_konf_1 = new Marmelad(10,(float) 0.4,"marmelad_1",true,"white");
		Marmelad M_konf_2 = new Marmelad(12,(float) 0.44,"marmelad_2",false,"green");
		SchokoladKonf S_konf_1= new SchokoladKonf(20,(float)0.6,"shokolad_1","Milk S","Funduk","Izum" );
		SchokoladKonf S_konf_2= new SchokoladKonf(22,(float)0.61,"shokolad_2","Milk S","  ","Kuraga" );
		
		
		
		M_konf_1.print_inf();
		M_konf_2.print_inf();
		S_konf_1.print_inf();
		S_konf_2.print_inf();
		
	}

}
