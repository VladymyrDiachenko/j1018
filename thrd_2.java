import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
public class thrd_2 {
	
	public static void main(String[] args) {
        
	    
		Thread t = Thread.currentThread(); // получаем главный поток
		Thread t2 = new Thread();
	    t2.sleep(3000);
	  //  t.sleep(2000);
    //    return "Return some result";

	    
	    System.out.println(t); // main
	}

}
