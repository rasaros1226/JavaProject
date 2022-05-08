package december15;

public class Nestedifstatement {

	
	String Name;
	int Age;
	float Weight;
	
	
	public Nestedifstatement(String Name, int Age, float Weight) {
		this.Name = Name;
		this.Age = Age;
		this.Weight = Weight;
	}
	
	
	public void method1() {
		System.out.println("\nBlood Doner information");
		System.out.println("\nName of Person: " + Name);
		
		
		if (Age > 18 && Age < 65) {
			if(Weight > 50) {
				System.out.println("You are eligibe to donate blood");
			}
		}
			
		if (Age >= 18 && Age <= 65) {
			if(Weight < 50) {
				System.out.println("You are not eligible to donate blood");
				System.out.println("Due to your weight is not match with blood donation criteria");
				System.out.println("Minimum weight required 50kg ");
			}
		}
		
		if (Age <= 18 || Age >= 65) {
			if(Weight > 50) {
				System.out.println("You are not eligible to donate blood");
				System.out.println("Due to your age is not match with blood donation criteria");
				System.out.println("Minimum Age required 18 and Maximum Age required 65");
			}
		}
		
		if (Age <= 18 || Age>= 65) {
			if(Weight < 50) {
				System.out.println("You are not eligible to donate blood");
				System.out.println("Due to your age and weight is not match with blood donation criteria");
				System.out.println("Minimum Age required 18 and Maximum Age required 65" + "\nMinimum weight required 50kg");
			}
		}
		
		}
	
	public static void main(String [] args) {
		Nestedifstatement object = new Nestedifstatement("Raj Rathod", 24, 70.50f);
		object.method1();
		Nestedifstatement object1 = new Nestedifstatement("Rupesh Patil", 55, 49);
		object1.method1();
		Nestedifstatement object2 = new Nestedifstatement("Krishna Kulkarni", 18,52);
		object2.method1();
		Nestedifstatement object3 = new Nestedifstatement("Shweta shinde", 17, 49);
		object3.method1();
	}
	
		
}
