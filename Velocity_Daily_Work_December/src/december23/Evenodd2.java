package december23;

public class Evenodd2 {

	int a;
	int b=1000;
	public void method1() {
		for(int i=1;i<=1;i++) {
			System.out.print("Even number are:");
		}
		System.out.println("\tOdd number are: ");
		
	for(a=500;a<=b;a++) {	
	
		if(a%2==0){
			
			System.out.print(a);
		}
		else {
			
			System.out.println("\t\t\t"+ a);
		}
	}
		
	}
	public static void main(String [] args) {
		Evenodd2 object = new Evenodd2();
		object.method1();
	}
}
