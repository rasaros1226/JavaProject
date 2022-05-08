package jan19;

public class ReverseNumber {
	
    int Number=121;
    int Number1=Number;
	int a=0;
	int b=0;
	
	public void method() {
	
		while(Number1!=0) {
			a=Number1%10;
			b=b*10+a;
			Number1=Number1/10;
		}
		System.out.println(b);
		if(b==Number) {
			System.out.println(Number + " is a palindrome number");
		}
	}
	public static void main(String []args) {
		ReverseNumber obj = new ReverseNumber();
		obj.method();
	}
}
