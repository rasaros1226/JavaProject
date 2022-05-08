package fibonacciseries;

public class FibonacciSeries1 {

	
	int n1=0;
	int n2=1;
	int n3;
	
	public void method1() {
		System.out.print(n1 +" "+ n2 +",");
		for(int i=1;i<=18;i++) {
			n3=n2+n1;
			n1=n2;
			n2=n3;
			System.out.print(n3 + ",");
		
		}
	}
	public static void main(String[] args) {
		FibonacciSeries1 object = new FibonacciSeries1();
		object.method1();
		
	}
}
