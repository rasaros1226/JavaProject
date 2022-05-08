package evenodd;

public class Evenoddusingifelse {

	int Number=234;
	
	public void method1() {
		
	if(Number%2==0) {	
		System.out.println(Number + " is an Even number");
	}
	else {
		System.out.println(Number + " is an odd number");
	}
	
	}

	public static void main(String[] args) {
		Evenoddusingifelse object = new Evenoddusingifelse();
		object.method1();
		
	}
	
}
