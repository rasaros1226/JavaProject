package december15;

public class Oroperator {

	int a = 10;
	int b = 20;
	int c = 30;
	int d = 10;
	
	public void method1() {
		//Logical OR
		System.out.println(a>c || d>c);
		System.out.println(b<d || c>b);
		System.out.println(a>c || b>a);
		System.out.println(b>a || a<c);
		//Bitwise OR
		System.out.println(a>c | d>c);
		System.out.println(b<d | c>b);
		System.out.println(a>c | b>a);
		System.out.println(b>a | a<c);
		
	}
	public static void main(String [] args) {
		Oroperator object = new Oroperator();
		object.method1();
		
	}
	
	
}
