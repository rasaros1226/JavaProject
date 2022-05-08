package stringProgram;

public class FirstLetterUpperCas {

	public static void main(String[] args) {
		
		String name = "i love india";
		name= name.substring(0,1).toUpperCase()+name.substring(1);
		System.out.println(name);
		
		
	}
	
}
