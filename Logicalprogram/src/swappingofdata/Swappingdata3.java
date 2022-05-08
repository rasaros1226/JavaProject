package swappingofdata;

public class Swappingdata3 {

	int a=10;
	int b=20;
	
	public void method1() {
	
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("The value of a is "+a);
		System.out.println("The value of b is "+b);
	}
	

	public static void main(String [] args) {
		
		Swappingdata3 object = new Swappingdata3();
		object.method1();
		
	}
	


}
