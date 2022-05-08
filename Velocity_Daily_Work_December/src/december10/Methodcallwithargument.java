package december10;

public class Methodcallwithargument {
	
	
	
	public void method1(int a) {
	int square = a*a;
	System.out.println("Square of " + a + " is: " + square);
	}
	
	
	public static void method2(float a, float b) {
	
		float Addition;
		Addition = a + b;
		System.out.println("Addition of " + a + " & " + b + " is " + Addition);
		
	}

	public static void main(String [] args) {
	Methodcallwithargument x = new Methodcallwithargument();
		x.method1(2);
		x.method1(5);
		method2(25,45);
		method2(14,12.5f);
		x.method1(15);
		
	}
}
