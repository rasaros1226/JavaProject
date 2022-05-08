package palindrome;

public class Palindrome4 {

	int a;
	int b;
	int Number;
	
	public void method1() {
		for(int i=1;i<=200;i++) {
			Number=i;
            a=0;
            b=0;
			while(Number!=0) {
			a=Number%10;
			b=b*10+a;
			Number=Number/10;
			}
			
			if(i==b) {
				System.out.println(i +" is palindrome number");
			}
		}
	}
	public static void main(String [] args) {
		Palindrome4 object = new Palindrome4();
		object.method1();
	}
}
