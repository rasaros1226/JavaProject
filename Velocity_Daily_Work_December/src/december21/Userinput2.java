package december21;

import java.util.Scanner;

public class Userinput2 {

	String Name;
	int Age;
	long Aadhar;
	long Mobile;
	
	public void method1() {
	System.out.println("Enter Your Name ");
	Scanner s = new Scanner(System.in);
	Name = s.nextLine();
	
	System.out.println("Enter yor age");
	Age = s.nextInt();
	
	System.out.println("Enter your Aadhar card number");
	Aadhar = s.nextLong();
	
	System.out.println("Enter your Mobile number");
	Mobile = s.nextLong();
	
	System.out.println("Thank you for Your details");
	System.out.println("Your Name: " + Name + "\nYour Age: " + Age);
	System.out.println("Your Aadhar number: " + Aadhar);
	System.out.println("Your Mobile number: " + Mobile);
	s.close();
		
	}
	public static void main(String [] args) {
		
		Userinput2 object = new Userinput2();
		object.method1();
		
	}
	
}
