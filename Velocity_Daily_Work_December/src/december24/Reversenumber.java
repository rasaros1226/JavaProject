package december24;

public class Reversenumber {

	int i = 3234;
	int a;
	int b=0;
	public void method1() {
		while(i!=0) {
			a=i%10;
			b=b*10+a;
			i=i/10;
			
		}
		System.out.println("Reverse no. of  is " + b);
	}
	
	public static void main(String [] args) {
		Reversenumber object = new Reversenumber();
		object.method1();
		
	}
}
