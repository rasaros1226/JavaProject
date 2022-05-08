package stringProgram;

public class ReverseString3 {

	public static void main(String[] args) {
		
		String name="Hemant";
		
		StringBuilder b = new StringBuilder(name); 
		b.reverse();
		System.out.println(b);
		
	}
}
