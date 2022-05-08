package december30;

public class MethOL {

	public void MethodOL() {
		int a =10;
		System.out.println(a);
	}
	public void MethodOL(int a) { 
	int c =a*2;
	System.out.println(c);
	}
	
	public void MethodOL(int a, int b) {
	int c = a+b;
	System.out.println(c);
		
	}
	
	public void MethodOL(float a,int b, String Name) {
	System.out.println(a);
	System.out.println(b);
	System.out.println(Name);
	}
	
	public static void main(String [] args) {
		MethOL object = new MethOL();
		object.MethodOL();
		object.MethodOL(2);
		object.MethodOL(20, 40);
		object.MethodOL(30.0f, 40," Hemant");
		
	}
}
