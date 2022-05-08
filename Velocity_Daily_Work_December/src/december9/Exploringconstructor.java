package december9;

public class Exploringconstructor {

	 int c;
	 
	 int a;
	static long b;

	public Exploringconstructor(int c,int a, long b) {
		this.c = c;
		this.a = a;
		this.b = b;
	
		
	}
	
	public  void Method1() {
		System.out.println(a+b+c);
		
		
	}
	
	
	public static void main(String [] args) {
		
	
		Exploringconstructor  x =  new Exploringconstructor(1212, 556, 88787787884l);
		x.Method1();
		
	}
	
}
