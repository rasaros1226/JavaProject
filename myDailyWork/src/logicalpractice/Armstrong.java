package logicalpractice;

public class Armstrong {

	int Number=123;
	int N=Number;
	int a=0;
	int b=0;
	public void method1() {
		while(N!=0) {
		a=N%10;
		b=b+a*a*a;
		N=N/10;
		}
		System.out.println(b);
		if(Number==b) {
			System.out.println("Armstrong Number");
		}
	}
	public static void main(String[] args) {
		Armstrong obj = new Armstrong();
		obj.method1();
	}
}
