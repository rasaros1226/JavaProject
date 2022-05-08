package arrayProgram;

import java.util.Arrays;

public class MaxMinNumberArray {

	public static void main(String[] args) {
		
		int numbers[] = {2,46,7,52,98,32,23,54,23,54,12};
		
		Arrays.sort(numbers);
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("The maximum number is "+numbers[numbers.length-1]);
		System.out.println("The minimum number is "+numbers[0]);
	}
}
