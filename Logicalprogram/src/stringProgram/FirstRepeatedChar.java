package stringProgram;

public class FirstRepeatedChar {

	public static void main(String[] args) {

		String Name = "heemant";

		for (int i = 0; i < Name.length(); i++) {
		
			int count = 0;
			
			for (int j = i + 1; j < Name.length(); j++) {
				if (Name.charAt(i) == Name.charAt(j)) {
					System.out.println(Name.charAt(i));
					count++;
					}
			}
			if(count==1) {
				break;
			}

		}

	}
}
