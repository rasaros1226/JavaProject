package number;

public class Withoutloop {

	//for printing the number 1 to 10
	int a=1;
	public void method1() {
		if(a<=10) {
			System.out.println(a);
			a++;
			method1();
		}
	}
	
	//for printing the number 10 to 1
	int b=10;
	public void method2() {
		
		if(b>=1) {
			
			System.out.println(b);
			b--;
			method2();
		}
	}
	
	
	public static void main(String[] args) {
		Withoutloop obj = new Withoutloop();
		obj.method1();
		obj.method2();
	}
}
