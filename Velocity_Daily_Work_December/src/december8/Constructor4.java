package december8;

public class Constructor4 {

	//declaration
	
	String Name;
	int Age;
	long mobile_number;
	long Aadhar_Number;

	//initialization
	
	public Constructor4(String Name1,int Age1,long Mobile1,long Aadhar1 ) {
		Name = Name1;
		Age = Age1;
		mobile_number = Mobile1;
		Aadhar_Number = Aadhar1;
			
	}


	public void Method1() {
		System.out.println("Information of Vaccination");
		System.out.println("Name = "+ Name + "\nAge =" + Age + "\nMobile no. = " + mobile_number + "\nAadhar number = " + Aadhar_Number);
		
		
	}


	public static void main(String [] args) {
		Constructor4 x = new Constructor4("Hemant Ahire",24, 9975001109L ,7219117509L);
	
		x.Method1();
		
		Constructor4 i = new Constructor4("Shobha ahire", 43, 9960336342L, 9860826085L);
		
		i.Method1();
	}




}
