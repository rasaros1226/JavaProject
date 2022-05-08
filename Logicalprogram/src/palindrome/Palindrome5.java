package palindrome;

public class Palindrome5 {

	int Number =131;
	int Number1=Number;
	int a=0;
	int b=0;
	
	public void method() {
	
		while(Number!=0) {
			a=Number%10;
			b=b*10+a;
			Number=Number/10;
		}
		
		System.out.println(b+ " Reverse Number");
		if(Number1==b) {
			System.out.println(Number1 + " is palindrome Number");
		}
		else {
			System.out.println(Number1 + " is not palindrome Number");
		}
		
	}
	
	public static void main(String[] args) {
		Palindrome5 obj = new Palindrome5();
		obj.method();
	}
	
	
}
