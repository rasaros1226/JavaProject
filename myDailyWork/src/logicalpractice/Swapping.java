package logicalpractice;

public class Swapping {

	int a=20;
	int b=10;
	public void  method1() {
	
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
	
	}
	public void method2() {
		System.out.println(a);
		System.out.println(b);
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
	}
	public void method3() {
		b=a*b; //200
		a=b/a; //10
		b=b/a; //20
		System.out.println("value of a is "+a);
		System.out.println("Value of b is " +b);
	}
	
	
	public static void main(String [] args) {
	Swapping object = new Swapping();
	object.method1();
	object.method2();
	object.method3();
	
	}
	
}
