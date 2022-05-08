package arrayProgram;


import java.util.Arrays;
import java.util.HashMap;

public class NonRepeatedNumber {

	public static void main(String[] args) {
		
		int array[] = {1,3,4,5,6,7,8,9,2,2,3,5};
		
		HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
		Arrays.sort(array);
        for(int i=0;i<array.length;i++) {
        	for(int j=i+1;j<array.length;j++) {
        		if(array[i]!=array[j]) {

                	h.put(array[i], i);
		
        		}
        		
        	}
        	
        	        }
        System.out.println(h.keySet());
		
	}
}
