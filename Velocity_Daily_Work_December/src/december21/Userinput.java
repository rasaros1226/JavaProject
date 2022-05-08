package december21;
import java.util.Scanner;

public class Userinput {

	public static void main(String [] args) {
		
		System.out.println("Enter your Full Name");
		Scanner s = new Scanner(System.in);
		String n = s.nextLine();
		System.out.println("Your Beautiful Name is " + n);
		s.close();
	}
	
	
}
