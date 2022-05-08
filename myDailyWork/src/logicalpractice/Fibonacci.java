package logicalpractice;

public class Fibonacci {

	int a=0;
	int b=1;
	int c;
	public void method1() {
		
	System.out.print(a+ " ");
	System.out.print(b+ " ");
		for(int i = 1;i<=20;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+ " ");
		}
		
	}
	public static void main(String[] args) {
		Fibonacci obj = new Fibonacci();
		obj.method1();
		
	}
}
