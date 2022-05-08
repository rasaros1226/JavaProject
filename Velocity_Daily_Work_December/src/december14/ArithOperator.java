package december14;

public class ArithOperator {

	int a =3;
	int b =40;
	float c;
	
	public void add() {
	c = a+b;
	System.out.println(c);	
	}
	
	public void sub() {
	c = a-b;	
	System.out.println(c);	
	}
	
	public void mul() {
	c = a*b;	
	System.out.println(c);	
	}
	
	public void div1() {
	c = b/a;	
	System.out.println(c);	
	}
	
	public void div2() {
	c = b%a;	
	System.out.println(c);	
	}
	
	public static void main(String [] args) {
	
	ArithOperator object = new ArithOperator();
	object.add();
	object.sub();
	object.mul();
	object.div1();
	object.div2();
		
		
		
	}
}
