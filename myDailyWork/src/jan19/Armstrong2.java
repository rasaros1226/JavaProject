package jan19;

public class Armstrong2 {

	public void method1() {
		for(int i=100;i<=999;i++) {
			int Number=i;
			int a=0;int b=0;
			while(Number!=0) {
				a=Number%10;
				b=b+a*a*a;
				Number=Number/10;
			}
			if(i==b) {
				System.out.println(i+" Palindrome number");
			}
		}
	}
	public static void main(String[] args) {
		Armstrong2 obj = new Armstrong2();
		obj.method1();
	}
}
