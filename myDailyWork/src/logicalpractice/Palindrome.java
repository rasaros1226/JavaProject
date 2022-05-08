package logicalpractice;

public class Palindrome {

	
	public void method1() {
	
		for(int i=1;i<=200;i++) {
			int Number=i;
			int a=0;
			int b=0;
			while(Number!=0) {
				a=Number%10;
				b=b*10+a;
				Number=Number/10;
			}
			if(b==i) {
				System.out.println(i+" is palindrome number");
			}
		}
	}
	
	public static void main(String [] args) {
		Palindrome object = new Palindrome();
		object.method1();
	}
}
