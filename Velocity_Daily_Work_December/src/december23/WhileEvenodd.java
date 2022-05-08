package december23;

import java.util.Scanner;


public class WhileEvenodd {
	

	
	public void method1() {

		Scanner s = new Scanner(System.in);
		
		int i=1;
		int a;
		while(i>=1) {
			
	
		System.out.println("Enter the value ");
		a= s.nextInt();
		
		if(a%2==0) {
			System.out.println(a + " is a even number");
		}
		else {
			System.out.println(a + " is odd number");
		}
		i++;
	}
		
		s.close();
		
	}	
	public static void main(String[] args) {
		WhileEvenodd object = new WhileEvenodd();
		object.method1();
	}
}
