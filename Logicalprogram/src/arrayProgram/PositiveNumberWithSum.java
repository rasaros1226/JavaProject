package arrayProgram;

public class PositiveNumberWithSum {

	public static void main(String[] args) {
		
		int Number[] = {12,34,64,33,-1,3,3,-3,-5,-78,-9,-112};
	    int sum=0;
		
		for(int i=0;i<Number.length;i++) {
			if(Number[i]>0) {
			sum=sum+Number[i];	
			}
		}
	    System.out.println("Sum of positive number: "+sum);
	}
}
