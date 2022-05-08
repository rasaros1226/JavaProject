package december6;

public class Practiceone {
  
	//declaration
	long a;
	long b;
	float c;
	double d;
	int e;
	
	public void add() {		
	System.out.println(a+b);
	System.out.println(c);
	System.out.println(d);
	}
	
	public void sub() {
	System.out.println(a-b);
	System.out.println(e);
	}
	
	//usage
	public static void main(String [] args) {
	Practiceone a = new Practiceone();
	a.add();
	a.sub();
	}
}
