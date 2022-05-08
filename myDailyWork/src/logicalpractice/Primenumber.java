package logicalpractice;

public class Primenumber {

	public void method1() {
	
		for(int i =1000;i<=1300;i++) {
			int n=i;
			int a=0;
			for(int j=2;j<=n-1;j++) {
				if(n%j==0) {
					a=a+1;
					
				}	
			}
			if(a==0) {
				System.out.println(n+" is a prime number");
			}	
		}
	}
	
	public static void main(String [] args) {
	Primenumber object = new Primenumber();
	object.method1();
	}
}
