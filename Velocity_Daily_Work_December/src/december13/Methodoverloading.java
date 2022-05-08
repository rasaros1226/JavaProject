package december13;

public class Methodoverloading {

	
	public static void method1(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void method1(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void method1(int a, int b, String Name) {
		System.out.println(a+b+ " Name:  " + Name);
	}
	public void method1() {
		System.out.println("This concept is method overloading");
	}
	
	public static void main(String [] args) {
		method1(10,20);
		method1(10,20,30);
		Methodoverloading object = new Methodoverloading();
		object.method1(20,30,"Hello Peter");
		object.method1();
		method1(20,20,20);
	}	
}
