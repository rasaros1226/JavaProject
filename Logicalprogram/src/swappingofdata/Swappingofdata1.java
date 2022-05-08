package swappingofdata;

public class Swappingofdata1 {
	
	
	static int a=100;
	static int b=500;
	
	public static void main(String [] args) {
	
	int temp = a;
	a = b;
	b = temp;
	
	System.out.println("Value of a is " + a);
	System.out.println("Value of b is " + b);
	
	}
}
