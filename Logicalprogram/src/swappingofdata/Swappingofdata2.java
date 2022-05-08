package swappingofdata;

public class Swappingofdata2 {

	static int a= 10;
	static int b= 20;
	
	public static void main(String [] args) {
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("a value is: " + a);
	System.out.println("b value is: " +b);
	}
}
