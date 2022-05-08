package arrayProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class FirstNonRepeatedHashMap {
 
	public static void main(String[] args) {
	
		int number[] = {2,3,6,7,8,8,5,4,2,1};
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<number.length;i++) {
			int count =0;
			for(int j=i+1;j<number.length;j++) {
				if(number[i]==number[j]) {
					count++;
				
				}
			}
			if(count==0){
            map.put(number[i], count);
            break;
            }
			
			
		}
		
		System.out.println(map.keySet());
	}
}