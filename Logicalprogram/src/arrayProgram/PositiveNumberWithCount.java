package arrayProgram;

public class PositiveNumberWithCount {

	public static void main(String[] args) {
		
		int Number[] = {1,2,2,-3,1,-9,-6,-6,-2,1,4,7,9,10};
		int count =0;
		
		
		for(int i=0;i<Number.length;i++) {
			if(Number[i]>0) {
					
				System.out.println(Number[i]);
			    count++;	
			}
			}
		System.out.println("Total count: " + count);
		}
		
	}

