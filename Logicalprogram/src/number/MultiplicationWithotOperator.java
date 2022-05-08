package number;

public class MultiplicationWithotOperator {

	int a= 10;
	int b =20;
	int Mul=0;
	public void method() {
		for(int i=1;i<=b;i++) {
			Mul=Mul+a;
		}
		System.out.println(Mul);
	}
	
	public static void main(String[] args) {
		MultiplicationWithotOperator obj = new MultiplicationWithotOperator();
		obj.method();
	}
}
