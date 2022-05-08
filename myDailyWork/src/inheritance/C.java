package inheritance;

public class C  extends B{

	public void method5() {
		System.out.println("method5");
	}
	
	public static void main(String[] args) {
		C ob = new C();
		ob.method5();
		ob.method4();
		ob.method1();
	}
}
