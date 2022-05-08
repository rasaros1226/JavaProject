package allinOne;

public class B  extends A{

	public void test1() {
		System.out.println("test1 of B");
	}
	
	public static void main(String[] args) {
//		
		B obj2 = new B();
		obj2.test1();
//		obj2.test2();
//		
		A obj = new B();
		obj.test1();
		
		B obj3 = (B)obj;
		obj3.test1();
		

		
		
		
		
		
		
		
	}
	
	
}
