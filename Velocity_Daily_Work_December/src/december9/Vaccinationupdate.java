package december9;

public class Vaccinationupdate {

	//declaration
	String Name;
	int Age;
	long Aadhar;
	long Mobile;
	String Vaccination;
	char c;
	byte d;
	short e;
	
	//initialization
	public Vaccinationupdate(String Name, int Age,
			long Aadhar, long Mobile,String Vaccination) {
	
		this.Name = Name;
		this.Age = Age;
		this.Aadhar = Aadhar;
		this.Mobile = Mobile;
		this.Vaccination = Vaccination;
		
	}
	/* this line called as a Escape Sequence i can write any thing in between this comment lines */
	
	public void method1() {
		System.out.println("\nName of person = " + Name + "\nAge = "
				+ "" + Age +"\nAadhar = " + Aadhar + "\nMobile = " 
				+ Mobile + "\nVaccination Dose = " + Vaccination);
		}
	
	//usage 
	public static void main(String [] args) {

		//constructor calling
		Vaccinationupdate a = new Vaccinationupdate("Hemant Ahire", 
				24, 752489829171l, 7219117509l, "1st Dose");
		a.method1();
	
		
	}

}
