package december10;

public class Methodcallinganotherclass {

	//use for execution
	public static void main(String [] args) {
	
		//calling static method 
		Methodcallingwithinclass.method1();
		
		//calling non static method by creating object of that particular class
		Methodcallingwithinclass x = new Methodcallingwithinclass();
		x.method2();
		
		Methodcallingwithinclass.method1();
		
		x.method2();
		
		
	}
}
