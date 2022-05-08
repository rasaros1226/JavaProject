package evenodd;

public class EvenOddUsingFor {

	public void method() {
		
		for(int i=1;i<=500;i++) {
			
			if(i%2==0) {
				System.out.print(i+ " " );
			}	
		}
	}

	public static void main(String[] args) {
		EvenOddUsingFor obj = new EvenOddUsingFor();
		obj.method();
	}
}
