package logicalpractice;
import java.util.Scanner;

public class UserPrime {

	int a;
	public void method1() {
		
	System.out.println("Enter number");
	Scanner s = new Scanner(System.in);
	int Number = s.nextInt();
	a=0;
	for(int i=2;i<=Number-1;i++) {
		
		if(Number%i==0) {
			a=a+1;
		}
	}
	System.out.println(a);
	if(a==0) {
		System.out.println(Number +" is prime Number");
	}
	else {
		System.out.println(Number + " is not prime number");
	}
	s.close();
	
	}
	
	public static void main(String [] args) {
		UserPrime object = new UserPrime();
		object.method1();
	}


}
