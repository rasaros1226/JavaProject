package december22;

public class Forloop6 {

	public void method1() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();	
		}	
	}
	public void method2() {
		for(int i = 1;i<=6;i++) {
			for(int j =6;j>=i;j--) {
				System.out.print("* " );
			}
		System.out.println();
		}
		
	}
	
	public static void main(String [] args) {
		Forloop6 object = new Forloop6();
		object.method1();
		object.method2();
	}

}
