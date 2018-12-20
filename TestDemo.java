import java.util.Scanner;
public class TestDemo {

	
public static void  main (String[] args )
{
	/*System.out.println("Viva java!");
	
	System.out.println(5.2-4.1);
	
	Boolean b = true;
	
	//int i2 =
	
	byte b2 = 1;
	int i2 = 1;
	
	//b2=i2;
	
	long l2 = 1000000;
	double d2 = 3.4;
	
	d2 = l2;
*/
	

    
    int varl; 
    int var2; 

    varl = 1024; 

    System.out.println("varl contains " + varl);

    var2 = varl / 2;

    System.out.print("var2 contains varl / 2: ");
    System.out.println (var2) ;

    // ----------------------------------------
    /*
    int a, b, c ;
    a = 2;
    b = 3;

    if(a < b) System.out.println("a is less than b");
    // следующая строка не должна выводиться
   // if(а == b) System.out.println("you won't see this");

    System.out.println();
   // System.out.println();

    с = a-b; // переменная с содержит значение -1

    System.out.println("с contains -Iм");
    if(с >= 0) System.out.println("с is non-negative");
    if(c < 0) System.out.println("c is negative");

    System.out.println();

    с = b - a; // переменная с теперь содержит значение 1

            int count;
        // Этот цикл выполняется пять pas.
        for(count = 0; count < 5; count = count+1)
        System.out.println("This is count: " + count);

        System.out.println("Done!");
    с = b - a; // переменная с теперь содержит значение 1

    System.out.println("с contains 1");
    if(с >= 0) System.out.println("с is non-negative");
    if(c < 0) System.out.println("c is negative");
    
    
   */
    
    int count;
    // Этот цикл выполняется пять pas.
    for(count = 0; count < 5; count = count+1)
    System.out.println("This is count: " + count);

    System.out.println("Done!");
    
    

    System.out.println("---------------------------------");
    
    int counter;
    double gallons, liters;

    // Первоначально в счетчике строк устанавливается нулевое значение.
    counter = 0;
    for(gallons = 1; gallons <= 100; gallons++) {
    liters = gallons * 3.7854; // преобразовать в литры
 //   System.out.println (gallons + " gallons is " +    liters + " liters.");

    // Приращение счетчика строк происходит на каждом шаге цикла,
    //а через каждые десять строк выводится пустая строка.
    counter++;
    if(counter == 10) {
//    System.out.println();
    counter = 0; // сбросить счетчик строк
    }
    }
    
    
    // VES
    
    double ves_l,ves_z;
    ves_z=95;
    ves_l = ves_z*0.17;
    System.out.println("ves na Lune ="+ ves_l);
    
    
    // Inch to M
    
    count = 0;
    Double Duym,metrs;
    Duym  = 1/39.37;
        System.out.println("1 D = "+Duym);
        
        for(counter = 1; counter <= 144; counter++) {
            metrs = counter * Duym; // 
        //    System.out.println ( counter + " Duym = " + metrs+ " metrs");

            // Приращение счетчика строк происходит на каждом шаге цикла,
            //а через каждые десять строк выводится пустая строка.
            count++;
            if(count == 12) {
        //    System.out.println();
            count = 0; 
            }
        }
    
        System.out.println(2<<3);
      //  System.out.println(3^4);
      //javascript.ru bitwise operator   pobitowie operacii
        
        //System.out.println r (false && (1<5/0));
       // System.out.println(true || (1<5/0));
      //  System.out.println(Math.round(5.4))
       // int i 
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("qqqq");
        String nextLine = sc.nextLine();
        System.out.println(nextLine);
        
       // int parseInt = Integer.parseInt("20");
        
        String  str = "Hello";
        
        
        
    }
    



}

