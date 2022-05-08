package december22;

import java.util.Scanner;
public class Forloop1 {

	int a;
	
	public void method1() {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your value ");
	a = s.nextInt();
	System.out.println("The table of " +  a + " is: ");
	for(int i=1;i<=10;i++) {
		System.out.print(a+" * "+i + " = " );
		System.out.println(a*i);
		
		
	}
	s.close();
		
	}
	public static void main(String [] args) {
	Forloop1 object = new Forloop1();
	object.method1();
		
	}
}


