package december14;

public class Unaryoperator3 {

	boolean a = 100 < 20;
	boolean b = 100 > 20;
	boolean c = 49  <= 50;
	boolean d = 49  >= 50;
	
	public void method1() {
		
	    // ! not equal operator 
		
		System.out.println(a);  //original output of boolean a
		System.out.println(!a); //a is inverted
		System.out.println(b);  //original output of boolean b
		System.out.println(!b); //b is inverted
		System.out.println(c);  //original output of boolean c
		System.out.println(!c); //c is inverted
		System.out.println(d);  //original output of boolean d
		System.out.println(!d); //d is inverted
	}
	
	public static void main(String [] args) {
		Unaryoperator3 object = new Unaryoperator3();
		object.method1();
		
	}
	
}
