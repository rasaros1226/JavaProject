package december16;

public class Ifelsestatement {
	
	String Name;
	int Age;
	int Weight;
	

	public Ifelsestatement(String Name, int Age, int Weight) {
		this.Name= Name;
		this.Age = Age;
		this.Weight=Weight;
	}
	
	public void method1() {
		System.out.println("\nDonation detail");
		System.out.println("\nName of person: " + "\""+ Name +"\"" );

		if(Age>18 && Age<65 && Weight>50) {
			
				
				System.out.println("You are eligible to donate blood");
			
		}
		else{
			System.out.println("You are not eligible to donate blood");
		}

	}
	
	public static void main(String [] args) {
		Ifelsestatement object = new Ifelsestatement("Hemant Ahire", 24, 5);
		object.method1();
		
	}
	
}
