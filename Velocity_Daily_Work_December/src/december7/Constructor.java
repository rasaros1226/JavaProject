package december7;

public class Constructor {

	//declaration
	static int a;
	static float b;
	 char c;
	
	//initialization
	public Constructor() {
		a = 12;
		b = 15;
		c = 'H';
		
	}
	
	//usage
	
	public static void add() {
		System.out.println(a+b);
		
		
	}
	public void sub() {
	
		System.out.println(b-a);
		System.out.println(c);
	}
	public static void main(String [] args) {
		Constructor object = new Constructor();
		object.sub();
		add();
		
	}
	
}
