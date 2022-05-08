package arrayProgram;

import java.util.Arrays;

public class FirstRepetedNumber {

	public static void main(String[] args) {
		
		int Number[]= {2,4,9,4,8,5,3,1,9};
		
		Arrays.sort(Number);
		
		for(int i=0;i<Number.length;i++) {
			
			int count =0;
			for(int j=i+1;j<Number.length;j++) {
				if(Number[i]==Number[j]) {
					count++;
				}
			}
			if(count>=1) {
				System.out.println("The first repeated Number: "+Number[i]);
				break;
			}
		}
		
		
	}
}
