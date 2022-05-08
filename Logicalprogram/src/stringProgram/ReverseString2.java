package stringProgram;

public class ReverseString2 {
	
	public static void main(String[] args) {
		
		String Name = "I LOVE INDIA";
		String[] parts = Name.split("");
		
		for(int i=parts.length-1;i>=0;i--) {
			System.out.print(parts[i]);
		}
		
	
		
		
	}
	
	

}
