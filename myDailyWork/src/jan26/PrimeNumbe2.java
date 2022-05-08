package jan26;

public class PrimeNumbe2 {

	public void method() {
		for(int i=1;i<=200;i++) {
			int Number=i;
			int Prime=0;
			for(int j =2;j<i;j++) {
				if(Number%j==0) {
					Prime=Prime+1;
				}
			}
			if(Prime==0) {
				System.out.println(Number+" is Prime");
			}
			else {
				System.out.println( Number+" is not prime");
			}
		}
		
	}
	public static void main(String[] args) {
		PrimeNumbe2 obj = new PrimeNumbe2();
		obj.method();
	}
}
