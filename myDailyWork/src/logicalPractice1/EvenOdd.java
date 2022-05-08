package logicalPractice1;

public class EvenOdd {

	int Number=11;
	
	public void method() {
		if(Number%2==0) {
			System.out.println(Number+" is even");
		}
		else {
			System.out.println(Number +" is odd");
		}
		
		
		
	}
	public static void main(String[] args) {
		EvenOdd obj = new EvenOdd();
		obj.method();
	}
	
}
