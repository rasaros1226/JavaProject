package stringProgram;

public class PalindromeString {

	public static void main(String[] args) {

		String name = "madam";
		// String name= "Madam";

		String name2 = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			name2 = name2 + name.charAt(i);
		}
		if (name2.equals(name)) {
			System.out.println("It is palindrome String");
		} else {
			System.out.println("It is Not Palindrome String");
		}

	}
}
