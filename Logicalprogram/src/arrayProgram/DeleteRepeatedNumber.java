package arrayProgram;

import java.util.LinkedHashSet;

public class DeleteRepeatedNumber {

	public static void main(String[] args) {
	 
		int array[]= {1,1,2,3,4,4,5,6,6,7,8,3,4,4};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for(int i=0;i<array.length;i++) {
			set.add(array[i]);
			
		}
		System.out.println(set);
		
	}
}
