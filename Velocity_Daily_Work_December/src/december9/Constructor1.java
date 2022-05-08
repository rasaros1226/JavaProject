package december9;

public class Constructor1 {

	static float d;
	static float c;
	static int a;
	static int b;
	
	public Constructor1() {
		d= 123f;
		c= 232323f;
		a = 212;
		b = 121;	
	}
	
	public static void method1() {
	System.out.println(a+b);
		
	}

	public static void main(String [] args) {
		new Constructor1();
		method1();
		
	}
	
}
