package jan19;

public class Evenodd {

	int Number=11;
	
	public void method() {
		
		if(Number%2==0) {
			System.out.println(Number +"Number is even");
			}
		else {
			System.out.println(Number+"Number is odd");
		}
	}
	public static void main(String [] args) {
		Evenodd obj = new Evenodd();
		obj.method();
	}
}