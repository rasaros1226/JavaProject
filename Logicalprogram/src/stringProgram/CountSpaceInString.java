package stringProgram;

public class CountSpaceInString {

	public static void main(String[] args) {

		String name = "I Love India";
		int Count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ') {
				Count++;
			}
			
		}
		System.out.println("Total number of space is "+ Count);
	}
}
