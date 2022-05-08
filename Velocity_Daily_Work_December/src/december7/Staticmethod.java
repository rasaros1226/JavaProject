package december7;

public class Staticmethod {
 
	static int a = 120;
	static int b = 250;
	static float c = 1.0f;
	static float d = 111;
	
	
	
 
	public static void main(String [] args) {
		Staticmethod object = new Staticmethod();
		System.out.println(Staticmethod.a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		add();
		object.sub();
		
		}
 
	public static void add() {
		
	    System.out.println(Staticmethod.a+Staticmethod.b);
		System.out.println(c+d);
	}
	public void sub() {
		System.out.println(a-b);
		System.out.println(a+b);
		 
		
		
	}
}
