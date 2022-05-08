package jan19;

public class Swapping {

	
	public void method() {
		int a=10;
		int b=20;
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("the value of a "+a);
		System.out.println("the value of b " +b);
		
	}
	public void method1() {
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		}
	
	public void method2() {
		int a=10;
		int b=20;
		
		a=a*b;//200 10*20
		b=a/b;//10   200/20
		a=a/b;//20     200/10
		System.out.println(a);
		System.out.println(b);
	}
	public static void main (String [] args) {
		Swapping obj = new Swapping();
		obj.method();
		obj.method1();
		obj.method2();
	}
}
