package practiceformock;

public class Practiceone3 {

	static int a;
	static int b;
	static int c;
	
	public static void main(String [] args) {
	a= 10;
	b=12;
	//-(a+1)
	System.out.println(~a);//-11
	System.out.println(~b);//-13
	c = ~ (a+b);//-23
	System.out.println(c);//10
	}
	
}
