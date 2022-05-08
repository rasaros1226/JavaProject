package arrayProgram;

public class FirstNonRepeated {

	public static void main(String[] args) {
		
		int number[]= {1,2,3,4,2,1,5,8,5,6,7,8,9};
		
		for(int i=0;i<number.length;i++) {
			int count=0;
			for(int j=i+1;j<number.length;j++) {
			if(number[i]==number[j]) {	
				count++;
			}
			}
			if(count==0) {
				System.out.println(number[i]);
				break;
			}
		}
	}
}
