package stringProgram;

public class CountCharInString {

	public static void main(String[] args) {
		
		String name ="i can do it belive my self i will definetly achieve my goal";
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='e') {
			count++;	
			}
		}
		System.out.println("Total number of e is "+count);
		
	}
}
