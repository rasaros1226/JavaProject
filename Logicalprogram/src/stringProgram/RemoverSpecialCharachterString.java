package stringProgram;

public class RemoverSpecialCharachterString {

	public static void main(String[] args) {
		
		String name = "He!!@@##$$m$$%**&)(()({}}&a12345n##t";
		
		//for printing charachter A-Z,a-z
		
		String name1=name.replaceAll("[^a-zA-z]", "");
		System.out.println(name1);
		
		//for printing special charachter
		String name2=name.replaceAll("[a-zA-z0-9]","");
		System.out.println(name2);
	}
}
