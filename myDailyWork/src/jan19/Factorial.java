package jan19;

public class Factorial {

	int Number=6;
	
	public void method() {
	
		
		for(int i=Number-1;i>0;i--) {
			
			Number = Number*i; //5*4*3*2*1
		}
		System.out.println(Number);
	}
	
	
	
	int Number1=5;
	int fact=1;
	public void method2() {
		for(int i= 1;i<=Number1;i++) {
			fact=fact*i;   //1*1=1,1*2=2,2*3=6,6*4=24,24*5=120
			System.out.println(fact);
		}
		System.out.println(fact);
	}
	
	
	public static void main(String [] args) {
		Factorial obj = new Factorial();
		obj.method();
		obj.method2();
	}
}
