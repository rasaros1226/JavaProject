package december15;

public class Ifstatement {

	int a;
	int b;
	
	public Ifstatement() {
	    a = 59;
	    b = 60;
	}

	public void method1() {
		if(a>b) {
			
		
			System.out.println("a is having big number" );
		}
		if(a<b) {
			
			System.out.println("b is having big number");
		}
		if(a==b) {
			System.out.println("both a and b having same number");
			
		}
	}
	
	public static void main(String [] args) {
		Ifstatement object = new Ifstatement();
		object.method1();
		
	}

}
