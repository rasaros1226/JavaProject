package palindrome;

public class Palindrome2 {
	
	public void method1() {
		
	
	for(int i=1100;i<=1300;i++) {
		
		int Number1=i;
		int a=0;
		int b=0;
		while(Number1!=0) {
		a=Number1%10;
		b=b*10+a;
		Number1=Number1/10;
			
		}
		if(i==b) {
			System.out.println( i +" is a palindrome number");
		}
	}
	}
	
	public static void main(String [] args) {
	Palindrome2 object = new Palindrome2();
	object.method1();
	}
}
