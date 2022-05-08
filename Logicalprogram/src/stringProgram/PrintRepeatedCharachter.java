package stringProgram;

public class PrintRepeatedCharachter {

	public static void main(String[] args) {

		String Name = "eeeddssffgds";

		for (int i = 0; i < Name.length(); i++) {

			for (int j = i + 1; j < Name.length(); j++) {

				if (Name.charAt(i) == Name.charAt(j)) {
					System.out.println(Name.charAt(i));

				}
			}
		}

	}
}
