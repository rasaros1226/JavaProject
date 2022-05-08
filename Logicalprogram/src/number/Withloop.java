package number;

public class Withloop {

	public void method1() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		}
	
	
	public void method2() {
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		Withloop obj = new Withloop();
		obj.method1();
		obj.method2();
	}
}
