package stringProgram;

public class StringEqualsandOperator {

	public static void main(String[] args) {
		
		String s1 = "Hemant";
		String s2 = "Hemant";
		String s3 = "Ahire";
		String s4 = new String("Hemant");
		String s5 = new String("Omkar");
		String s6 = new String("Ahire");
		String s7 = new String("Hemant");
		
		
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		System.out.println(s1==s4);//false
		System.out.println(s1.equals(s4));//true
		System.out.println(s3.equals(s6));//true
		System.out.println(s5.equals(s6));//false
		System.out.println(s3==s6);//false
		System.out.println(s4==s7);//false when we create string by new keyword it
		//will create new object even your object is same

		//== refere the object / reference 
		//return true if the obj ref are referring to same object
		//return false if the obj ref are reffering to diffrent object
				
		//equals
		//check content in object thats it
				
				
		
		
	}
}
