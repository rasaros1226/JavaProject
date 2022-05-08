package december8;

public class Constructorstd3 {
 
	public Constructorstd3(String t) {
		
		System.out.println(t + " one Argument constructor is running");
		
	}
	
	public Constructorstd3(String a, String t) {
		
		System.out.println(a + t + " Two argument constructor is running");
		System.out.println(a);
		System.out.println(a + t);
	}

	public Constructorstd3(int a, int b, int c) {
		System.out.println(a+b);
		System.out.println(b+c);
		System.out.println(a+b+c);
		
		
	}
	public static void main(String [] args) {
		new Constructorstd3("one");
		new Constructorstd3("one", " + one =");
		new Constructorstd3(14, 24, 7);
	}
	

}
