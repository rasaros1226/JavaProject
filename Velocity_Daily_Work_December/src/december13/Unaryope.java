package december13;

public class Unaryope {

	
	public void method1(int a) {
		int b = a;
		System.out.println(b++);
		System.out.println(b++);
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b++);
		System.out.println(b++);
		System.out.println(+b);
		System.out.println(b++);
		System.out.println(b++);
		System.out.println(+b);
	}
	
	public static void main(String [] args) {
		
		Unaryope object = new Unaryope();
		object.method1(-10);
		
	}
}
