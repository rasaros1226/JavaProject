package arrayProgram;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
	 
	String name= "hemant ahire";
		
	for(char i:name.toCharArray()) {
		if(name.indexOf(i)==name.lastIndexOf(i)) {
			System.out.println(i);
			break;
		}
		
	}
	
	
	}
}