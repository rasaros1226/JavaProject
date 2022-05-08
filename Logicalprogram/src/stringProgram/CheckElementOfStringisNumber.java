package stringProgram;

import java.util.regex.Pattern;

public class CheckElementOfStringisNumber {
	public static void main(String[] args) {

		String name[] = { "123 4","Hemant","1235"};
		Pattern pattern = Pattern.compile(".[^0-9].");
		for(int i=0;i<name.length;i++) {
			System.out.println("Input "+name[i]+" is number :"+!pattern.matcher(name[i]).matches());	
		
			
		}
	
	}
}
