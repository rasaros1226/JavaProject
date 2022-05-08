package jan19;

public class Primenumber {

	int Number = 17;
	int count=0;
	public void method1() {
		
		for(int i=2;i<Number;i++) {
			if(Number%i==0) {
				count=count+1;
			}
		}
		if(count==0) {
		System.out.println(Number+" Number is prime");
		}
		else {
			System.out.println(Number+" Number is not prime");
		}
	}
	public static void main(String [] args) {
		Primenumber obj = new Primenumber();
		obj.method1();
	}
}
