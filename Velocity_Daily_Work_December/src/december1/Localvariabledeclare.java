package december1;

public class Localvariabledeclare {
	
	// main method
	public static void main(String [] args) {
		
	// object declaration
		
	Localvariabledeclare object = new Localvariabledeclare();
		
	//calling non static method
		object.data1();
		
		
	}
	
	//declaration of non static method
	public void data1() {
		
		// declaration and initialization of local variable a having int datatype
		int a = 10;
		
		// declaration and initialization of local variable b having string datatype
		String b = "Hemant Ahire ";
		
		//declaration and initialization of local variable Classname having string datatype
		String Classname = "Velocity";
		
		// printing statements
		System.out.println(a);
		System.out.println(b);
		System.out.println(Classname);
		
		
	}

}
