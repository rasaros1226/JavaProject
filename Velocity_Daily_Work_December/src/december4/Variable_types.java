package december4;

public class Variable_types {
	    // static variable
	    static int a=12; 
	    static int b=20;
	
	    //instance variable
	    int e = 1000;
	    short f = 2000;
	
	//main method
	public static void main(String [] args) {
		//local variable
		int E = 20;
		
		//object declaration
		Variable_types Aa = new Variable_types();
		
		
		add1(); // call static method
		
		Aa.test2(); //call non static method test1
		Aa.test3(); //call non static method test2
		
		System.out.println(E);//local variable
		
		}

	
	// static method
	public static void add1() {
		
		//local variable
		int c = 100; 
		int d = 200;
		System.out.println(a+b);//static variable
		System.out.println(c+d);//local variable
	
		
	}
	
	//non static method
	public void test2() {
		
		System.out.println(a-b);//static variable
		System.out.println(e+f);//non static variable or instance variable
		System.out.println(e-f);//non static variable or instance variable
		
	}
	//non static method
	public void test3() {
		
		int h =10;
		System.out.println(e*f);//non static variable or instance variable
		System.out.println(f/e);//non static variable or instance variable
		System.out.println(h);//local variable
		
		
	}
	
}
