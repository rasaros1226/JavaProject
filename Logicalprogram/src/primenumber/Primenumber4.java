package primenumber;

public class Primenumber4 {

	
	public void method1() {
		for(int i=1000;i<=1200;i++) {
			int count=0;
			int Number =i;
			for(int j=2;j<Number;j++) {
				if(Number%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(Number +" Number is prime");
			}
//			else {
//				System.out.println(Number+" Number is not prime");
//			}
			
		}
		
	}
	
	public static void main(String[] args) {
		Primenumber4 object = new Primenumber4();
		object.method1();
	}
}
