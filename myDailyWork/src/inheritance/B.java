package inheritance;

public class B extends A {

	public void method3() {
		System.out.println("method3");
	}
	
	public void method4() {
		System.out.println("method4");
	}
	
	public static void main(String[] args) {
		B ob = new B();
		ob.method3();
		ob.method4();
		ob.method1();
		ob.method2();
	}
}
