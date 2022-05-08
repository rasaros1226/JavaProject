package jan26;

public class PrimeNumber {

	public static void main(String[] args) {
		int Number=7;
		int Prime=0;
		for(int i=2;i<Number;i++) {
			
			if(Number%i==0) {
				Prime=Prime+1;
			}
		}
		if(Prime==0) {
			System.out.println(Number+" is prime");
		}
		else{
			System.out.println(Number +" is not prime");
		}
	}
}
