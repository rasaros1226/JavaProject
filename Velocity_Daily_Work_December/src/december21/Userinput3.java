package december21;

import java.util.Scanner;

public class Userinput3 {

	String ID = "hemantahire148@gmail.com";
	String PW = "Hemant@123";
	
	public void method1() {
	
		System.out.println("Enter User ID");
		Scanner s = new Scanner(System.in);
		String ID1 = s.nextLine();
		
		System.out.println("Enter Password");
		String PW1 = s.nextLine();
		
		if( PW == PW1 ) {
			System.out.println("Login Successfully");
		}
		else {
			System.out.println("Login Failed");
		}
		s.close();
		
	}
	public static void main(String [] args) {
		Userinput3 object = new Userinput3();
		object.method1();
		
	}
}
