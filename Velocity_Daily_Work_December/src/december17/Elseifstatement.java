package december17;

public class Elseifstatement {
	
	float a;
	String Name;
	
	public Elseifstatement(float a,String Name) {
		this.a =a;
		this.Name=Name;
	}
	
	public void method1() {
		
		System.out.println("\nFinal year Engineering Result");
		System.out.println("\nName of Student: "+ Name);
		
		if (a >= 68 && a<= 100)
		{
		    System.out.println("Congratulations,Your result is "+ a + "% First class with Distinction");	
		}
		else if (a >= 60 && a <= 67 ) {
			System.out.println("Congratulation,Your result is " + a +"% First class");
		}
		else if (a >= 50 && a <= 59) {
			System.out.println("Congratulations,Your result is " + a + "% second class");
		}
		else if (a >= 35 && a <= 49) {
			System.out.println("Congratulations,Your pass with " + a + "%");
		}
		else {
			System.out.println("Try next Year, your result is " + a + "%");
		}
	}
	
	public static void main(String [] args)
	{
		Elseifstatement object = new Elseifstatement(75,"Hemant Ahire");
		object.method1();
		Elseifstatement object1 = new Elseifstatement(67.5f,"Aniket jadhav");
        object1.method1();	
        Elseifstatement object2 = new Elseifstatement(61, "Amit sonaprate");
	    object2.method1();
	    Elseifstatement object3 = new Elseifstatement(55, "Vikas Gaikwad");
	    object3.method1();
	    Elseifstatement object4 = new Elseifstatement(40, "Vishal karande");
	    object4.method1();
	    Elseifstatement object5 = new Elseifstatement(20, "Omkar patil");
	    object5.method1();
	}
}
	