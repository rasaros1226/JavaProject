package december14;

public class Relationaloperator {

	
	int a = 10;
	int b = 20;
	int c = 10;
	int d = 19;
	
	
	public void method1() {
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(b > d);
		System.out.println(c >= d);
		System.out.println(d >= c);
		System.out.println(a <= c);
		System.out.println(c <= b);
		System.out.println(a == c);
		System.out.println(b == d);
		System.out.println(a != d);
		System.out.println(a != c);
		
	}
	
	public static void main(String [] args) {
		Relationaloperator object = new Relationaloperator();
		object.method1();	
	}
}
