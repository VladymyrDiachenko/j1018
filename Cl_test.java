
public class Cl_test {
	
	 public static void main(String[] args) {
         
	        Person tom = new Person(); // �������� �������
	        tom.displayInfo();
	         
	        // �������� ��� � �������
	        tom.name = "Tom";
	        tom.age = 34;
	        tom.displayInfo();
	    }
	}
	class Person{
	     
	    String name;    // ���
	    int age;        // �������
	    void displayInfo(){
	        System.out.printf("Name: %s \tAge: %d\n", name, age);
	    }

}
