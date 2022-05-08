package jan26;

public class Number {


	int a=10;
	int b=20;
	int mul;
	public void method() {
		
		for(int i=1;i<=a;i++) {
		mul=mul+b;	
		}
		System.out.println(mul);
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	Number obj = new Number();
	obj.method();
	
	
}
}