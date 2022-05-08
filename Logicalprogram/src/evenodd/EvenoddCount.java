package evenodd;

public class EvenoddCount {

	public void method() {
		
		int CountEven=0;
		int CountOdd=0;
		for(int i=1000;i<=1200;i++) {
			if(i%2==0) {
				System.out.println(i+" Number is even");
			    CountEven++;
			}
			else {
				System.out.println(i+ " Number is odd");
				CountOdd++;
			
			}
		}
		 System.out.println();
	     System.out.println("Even Numbers Count "+CountEven);	
	     System.out.println("Odd Numbers Count "+CountOdd);
	}
	
	public static void main(String[] args) {
		EvenoddCount obj = new EvenoddCount();
		obj.method();
	
	}

}
