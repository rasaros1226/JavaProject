package december10;

public class Poinstancevariable {

	//instance variable
	int a = 15;
	int b = 10;
	//static variable
	static int Aa = 10;
	
	
	public void priority() {
	
		//local variable
		int a = 12;
		int b= 15;
		
	System.out.println(a + b);
	System.out.println(this.a);
	System.out.println(this.b);
		
	}
	
	public static void method2() {
	System.out.println(Aa);	
		
		
	}

	public static void main(String [] args) {
		
		Poinstancevariable x = new Poinstancevariable();
		x.priority();
		
	}
}
