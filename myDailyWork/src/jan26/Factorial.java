package jan26;

public class Factorial {

	//5!=1*2*3*4*5


	int Number=6;
	int fact=1;
	public void method() {
		
		for(int i=1;i<=Number;i++) {
		fact=fact*i;	
		}
		System.out.println(fact);
		
	}
	public static void main(String[] args) {
		Factorial obj = new Factorial();
		obj.method();
	}
}
