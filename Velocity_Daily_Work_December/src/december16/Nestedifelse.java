package december16;

public class Nestedifelse {

	String Name = "Hemant Ahire";
	String Username = "hemantahire148@gmail.com";
	String Password = "Hemant@123";
	
	public void method1(String Name, String Username,String Password) {
		if(this.Name == Name) {
			if(this.Username == Username) {
				if(this.Password == Password) {
					System.out.println("Login Successfully");
				}
				
				else {
					System.out.println("Login failed,Invalid Password");
				}
			}
			
			else {
				System.out.println("Login failed,Invalid Username");
			}
		}
		
		else {
			System.out.println("Login Failed,Invalid Name");
		}

	}

	public static void main(String [] args) {
		
		Nestedifelse object = new Nestedifelse();
		object.method1("Hemant Aire","hemantahire148@gmail.com","Hemant@123");
		object.method1("Hemant Ahire","hemantahire148@yahoo.com","Hemant@123");
		object.method1("Hemant Ahire","hemantahire148@gmail.com","Hemant@148");
		object.method1("Hemant Ahire","hemantahire148@gmail.com","Hemant@123");
	
	}
}
