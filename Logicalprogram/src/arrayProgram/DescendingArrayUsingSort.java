package arrayProgram;

import java.util.Arrays;

public class DescendingArrayUsingSort {

	public static void main(String[] args) {
		int Number[] = {9,4,2,6,8,1,5,3,7,0};
		
		System.out.println("\nTo Descending Number");
		
		Arrays.sort(Number);
		
		for(int i= Number.length-1;i>=0;i--) {
			System.out.println(Number[i]);
		}
	}
}
