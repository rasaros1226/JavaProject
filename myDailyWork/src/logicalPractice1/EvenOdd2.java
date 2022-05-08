package logicalPractice1;

public class EvenOdd2 {

	public void method() {
		
		for(int i=1;i<=500;i++) {
			
			if(i%2==0) {
				System.out.println(i+ "Number is even");
			}
			
			
			
		}
		
		
		
	}

	public static void main(String[] args) {
		EvenOdd2 obj = new EvenOdd2();
		obj.method();
	}
}
