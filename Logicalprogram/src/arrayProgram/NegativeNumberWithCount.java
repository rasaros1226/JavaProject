package arrayProgram;

public class NegativeNumberWithCount {

	public static void main(String[] args) {
		
		int Number[] = {1,-23,4,-1,-224,-6,-7,-19,1,3,5,70,143,4};
		int Count=0;
		
		for(int i=0;i<Number.length;i++) {
			if(Number[i]<0) {
				System.out.println(Number[i]);
				Count++;
			}
		}
		System.out.println("Total Number Count:" +Count);
	}
}
