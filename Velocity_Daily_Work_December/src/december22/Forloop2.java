package december22;
import java.util.Scanner;
public class Forloop2 {

	public  void method1() {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter value ");
	int a = s.nextInt();
	System.out.println("The table for "+ a +" is:");
	
	for(int i =1;i <=10;i++) {
	System.out.print(a+ " * " + i + ":");
	System.out.println(a*i);	
		
	}
	s.close();	
	}
	
	public static void main(String [] args) {
		Forloop2 object = new Forloop2();
		object.method1();
		
		
	}
}
