package collection;

import java.util.HashMap;

public class VowelsOccurence {

	public static void main(String[] args) {
		String name = "we like java automation";
		char array[] = name.toCharArray();
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char i : array) {
		    if(map.containsKey(i)) {	
		    	map.put(i, map.get(i)+1);
		    }
		    else {
		    	map.put(i, 1);
		    }
		}
		
	}
}
