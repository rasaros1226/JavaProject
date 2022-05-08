package arrayProgram;

public class RepeatedNumber {

	public static void main(String[] args) {
		
		int Number[] = {1,4,6,7,3,2,3,22,2,1,7,};
		int count=0;
		
		for(int i=0;i<Number.length;i++) {
			for(int j=i+1;j<Number.length;j++) {
				if(Number[i]==Number[j]) {
					System.out.println(Number[i]);
				    count++;
				}
				
			}
		}
		System.out.println("Total count is: "+count);
	}
}
