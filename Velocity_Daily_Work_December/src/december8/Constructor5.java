package december8;

public class Constructor5 {
	
	static String Name;
	static int Age;
	static long Mobile;
	static long Aadhar;
	
	public Constructor5(String Name1, int Age1, long mobile1, long aadhar1) {
		Name = Name1;
		Age = Age1;
		Mobile = mobile1;
		Aadhar = aadhar1;
		
		}

	public static void test1() {
		System.out.println("Name of Candidate = " + Name + "\nAge = " + Age + "\nMobile number = " + Mobile + "\nAadhar number = " + Aadhar);
	
	}
	
	public void test2() {
		System.out.println("\nName of Candidate = " + Name + "\nAge = " + Age + "\nMobile number = " + Mobile + "\nAadhar number = " + Aadhar);
		
	}
	
	public static void main(String [] args) {
		new Constructor5("Hemant Ahire", 24, 9975001109l, 7219117509l);
		test1();
		
		Constructor5 x = new Constructor5("Rupesh patil", 24, 752489829171l, 9680225545l);
		x.test2();
	}

}
