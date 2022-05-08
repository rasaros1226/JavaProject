package arrayProgram;

import java.util.Arrays;

public class AscendingArrayUsingSort {

	public static void main(String[] args) {
		
		int Number[]= {1,2,3,6,4,9,8,5,0};
		
		System.out.println("\nto print Ascending Number");
		//ascending
		
		Arrays.sort(Number);
		for(int i=0;i<Number.length;i++) {
			System.out.println(Number[i]);
		}
	}
	
	
}
