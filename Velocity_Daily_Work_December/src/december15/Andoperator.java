package december15;

public class Andoperator {

	public void method1(int a, int b, int c, int d) {
		// a=10,b=20,c=30,d=10
		//Logical AND
		System.out.println(a>b && b<d);
		System.out.println(a<b && b>c);
		System.out.println(b<d && c>b);
		System.out.println(b>a && c>b);
		//Bitwise AND
		System.out.println(a>b & b<d);
		System.out.println(a<b & b>c);
		System.out.println(b<d & c>b);
		System.out.println(b>a & c>b);
		
		
	}
	
	public static void main(String [] args) {
		Andoperator object = new Andoperator();
		object.method1(10,20,30,10);
		
	}
}
