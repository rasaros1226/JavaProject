package december9;

public class Constructor2 {

	//declaration
	String Name;
	int Age;
	float Height;
	String Colour;
	String Education;
	String Hobby;
	long Mobile;
	
	//initialization
	public Constructor2(String Name1, int Age1, float Height1,
			String Colour1, String Education1, String Hobby1, long Mobile1)
	{
	
		Name = Name1;
		Age = Age1;
		Height = Height1;
		Colour = Colour1;
		Education = Education1;
		Hobby = Hobby1;
		Mobile = Mobile1;
		
	}
	
	public void boy1() {
		System.out.println("\nBio Data of Boy");
		System.out.println("\nName of Boy = "+ Name );
		System.out.println("Boy's Age = "+ Age);
		System.out.println("Boy's Height = "+ Height);
		System.out.println("Boy's Colour = " + Colour);
		System.out.println("Boy's education = " + Education);
		System.out.println("Boy's Hobby = " + Hobby);
		System.out.println("Boy's Mobile number = " + Mobile);
		
	}
	
	public void girl1() {
		System.out.println("\nBio Data of Girl");
		System.out.println("\nName of Girl = "+ Name + "\nGirl's Age = " + Age);
		System.out.println("Girl's Height = " + Height + "\nGirl's Colour = "+ Colour);
	    System.out.println("Girl's Education = "+ Education + "\nGirl's Hobby = " + Hobby);
	    System.out.println("Girl's Mobile number = " + Mobile);
		
	}
	
	//usage
	public static void main(String [] args) {
		Constructor2 object = new Constructor2("rupesh patil", 25, 5.9f,
				"Bright", "Mechanical Engineer", "Treking", 7219117509l );
		object.boy1();
		Constructor2 object1 = new Constructor2("Shital", 23, 5.1f, "Bright",
				"BCA", "Photography" , 9975001109l );
		object1.girl1();
		
	}
	
	
}
