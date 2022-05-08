package logicalpractice;

public class Prime {

	int n=1;
	int temp=0;
	
	public void method1() {
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				temp=temp+1;
			}
		}
		if (temp==0) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not prime");
		}
	}
	public static void main(String[] args) {
		Prime obj = new Prime();
		obj.method1();
	}
}
