package primenumber;

public class Primenumber3 {

	int Number=11;
	boolean count =true;
	
	public void method1() {
		for(int i=2;i<Number;i++) {
			
			if(Number%i==0) {
				count=false;
			}
		}
		if(count==true) {
			System.out.println(Number +" Number is prime number");
		}
		else {
			System.out.println(Number + " Number is not prime");
		}
	}
	
	public static void main(String[] args) {
		Primenumber3 object = new Primenumber3();
		object.method1();
	}
}
