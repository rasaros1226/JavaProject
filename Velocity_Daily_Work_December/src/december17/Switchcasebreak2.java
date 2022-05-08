package december17;

public class Switchcasebreak2 {
	
	String Name;
	double Budget;
	String Brand;
	
	public void method1(double Budget, String Brand) {
	this.Budget = Budget;
	this.Brand = Brand;
		
		
		switch(Brand){
			
		case "Ford":
			if(Budget>2000000){
				System.out.println("Ford Endravour in 33.81lakh only");
			}
			else if(Budget > 700000 && Budget < 1000000) {	
				System.out.println("Ford EcoSport with 8.19lakh only");
				System.out.println("Ford Aspire with 7.28Lakh only");
				System.out.println("Ford Freestyle with 7.28lakh only");	
			}
			else if (Budget > 0 && Budget<700000) {
				System.out.println("Ford figo with 5.82Lakh only");
			}break;
			
		case "Skoda":
			if (Budget > 2000000) {
				System.out.println("Skoda octavia with 26.29 Lakh only");
				System.out.println("Skoda Superb wirh 32.85lakh");
			}
			else if(Budget > 700000 && Budget < 1500000) {

				System.out.println("Skoda Slavia with 10lakh only");
				System.out.println("Skoda Kushaq With 10.79lakh only");
				System.out.println("Skoda Rapid TSI with 7.80 lakh only");
			}
			else {
				System.out.println("Sorry we dont have options");
			}
			break;
		case "kia":
			if (Budget > 2000000) {
				
			    System.out.println("Kia Carens with 35lakh only");
				System.out.println("Kia Canival with 24.95lakh only");	
			}
			else if (Budget> 700000 && Budget< 1500000) {
				System.out.println("Kia Seltos with 9.95lakh only");
				System.out.println("Kia Sonet with 8lakh only");
				
			}break;
		}
		
	}
	
	
	public static void main(String [] args) {
		Switchcasebreak2 object = new Switchcasebreak2();
		object.method1(3000000,"Ford");
	}

}
