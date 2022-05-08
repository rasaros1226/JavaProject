package logicalPractice1;

public class EvenOdd3 {

	public void method() {
		
		int countEven=0;
		int countOdd=0;
		for(int i = 1;i<=15;i++) {
			
			
			if(i%2==0) {
				System.out.println(i+" is even");
				countEven++;
			}
			
			
			else {
				System.out.println(i+" is odd");
				countOdd++;
			}
		}
		System.out.println(countEven +" numbers are Even" );
		System.out.println(countOdd +" numbers are odd");
	}
	
	public static void main(String[] args) {
		EvenOdd3 obj = new EvenOdd3();
		obj.method();
	}
}
