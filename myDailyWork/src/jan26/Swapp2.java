package jan26;

public class Swapp2 {

	int a=10;int b=20;
	
	public void method() {
		//a=a+b; //30
		//b=a-b; //10 
		//a=a-b;//20
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Swapp2 obj = new Swapp2();
		obj.method();
	}
}
