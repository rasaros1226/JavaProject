package arrayProgram;

public class EvenNumber {

	public static void main(String[] args) {
		
		int Number[] = {1,4,56,865,21,3,5,-65,22,11,23,57,13};
		int sum=0;
		
		
		for(int i=0;i<Number.length;i++) {
			if(Number[i]%2==0) {
				System.out.println("Even number: "+Number[i]);
	            sum=sum+Number[i];
			}
			
		}
		
		    System.out.println("Sum of even numbers is: "+sum);
	}
}
