package collection;

import java.util.HashMap;

public class OcuuranceOfCharInString {

	public static void main(String[] args) {
		
		String name = "Hemant Ahire is a Software Engineer";
		String name2 = name.toLowerCase();
		
		char array[]= name2.toCharArray();
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char c : array) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
}
