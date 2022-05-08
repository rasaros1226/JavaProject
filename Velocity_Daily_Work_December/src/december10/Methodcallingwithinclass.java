package december10;

public class Methodcallingwithinclass {

	public static void method1() {
		System.out.println("This is Static method of Methodcallingwithinclass");
				
	}
	
	public void method2() {
	
		System.out.println("This is non static method of Methodcallingwithinclass");
		
	}
	
	public static void main(String [] args) {
		method1();
		Methodcallingwithinclass x = new Methodcallingwithinclass();
		x.method2();
		
		
	}
	
	
}
