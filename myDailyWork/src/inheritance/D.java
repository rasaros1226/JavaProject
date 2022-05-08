package inheritance;

public class D extends A {

	public void method3() {
		System.out.println("method3");
	}
	
	public void method4() {
		System.out.println("method4");
	}
	
	public static void main(String[] args) {
		D obj = new D();
		obj.method1();
		obj.method3();
	}
}
