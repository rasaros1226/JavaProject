package december7;

public class Standardizationofprogram {
	
	//in IT we prefer the Non static method for security
	
    //declaration: declared the variable with data types
	int a;
	float b;
	
	//initialization: give value to declared variable
	public void add() {
		a = 123;
		b = 500;
		System.out.println(a+b);	
	}
	
	//usage : use of both
	public static void main(String [] args) {
	Standardizationofprogram object = new Standardizationofprogram();
	object.add();
		
	}
	
	
}
