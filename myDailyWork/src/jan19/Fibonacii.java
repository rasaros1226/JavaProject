package jan19;

public class Fibonacii {

	int Number=8;
	int a=0;
	int b=1;
	int c;
	
	public void method() {
		System.out.print(a +" ");
		System.out.print(b + " ");
		
		for(int i=1;i<=Number;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+ " ");
		}
	}
	public static void main(String[] args) {
		Fibonacii obj = new Fibonacii();
		obj.method();
	}
}
