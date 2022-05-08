package december12;

public class Practice2 {

	public void method1(int a, float b) {
	float c= a+b;	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}
	public static void method2(int a, int b, int c) {
		int d = c + b;// d= 20 +10
		int e = a -d; //e = 50 +d
	System.out.println(d);	
	System.out.println(e);	
	}

	public static void main(String [] args) {
	Practice2 object = new Practice2();
	object.method1(1029,768);
	method2(50,10,20);
	Practice1 x = new Practice1();
	x.method1();
	Practice1.method2();
		
	}
}
