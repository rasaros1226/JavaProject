package logicalpractice;

public class Factorial1 {

	int a= 10;
	long factorial=1;
	public void method1() {
		for(int i=1;i<=a;i++) {
			factorial=factorial*i;	
		}
		System.out.println(factorial);
	}
	public static void main(String[] args) {
		Factorial1 obj = new Factorial1();
		obj.method1();
	}
}
