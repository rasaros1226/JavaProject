package december8;

public class Constructor {
	
//declaration
	
	int a;
	float b;
	
	//initialization
	public Constructor() {
		a = 10;
		b= 45;
		
	}
	
	//usage
	public void method1() {
		System.out.println(a);
		System.out.println(b);
	}
	
	  public static void main(String [] args) {
		Constructor x = new Constructor();
		x.method1();
		
		
	}

}
