package stringProgram;

public class StringImmutable {

	public static void main(String[] args) {
		
		
		
		//Hemant string will created in Heap and also in SCP
		String s1 = new String("Hemant");
		System.out.println(s1);
		
		
		
		//Ahire String will created in SCP and Hemant Ahire new String will created in Heap
		s1.concat("Ahire");
		System.out.println(s1);
		
		
		//Hemant Ahire string will created in Heap {new object} and s1 will now refer the new String
		s1=s1.concat("Ahire");
		System.out.println(s1);
		
		//that means when we try to change string object it will create new object 
		//will not change existing object thats why string is immutable
		
	
		
	}
}
