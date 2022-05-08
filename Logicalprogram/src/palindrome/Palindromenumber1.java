package palindrome;

public class Palindromenumber1 {

    
    int Number;
    
	public void method1(int Number) {
		int a=0;
	    int b=0;
	    this.Number =Number;
	    
		
	    
		while(Number !=0) {
			a=Number%10;
			b=b*10+a;
			Number=Number/10;	
		}
		System.out.println("the reverse number is "+b);
		
		
		if(this.Number==b) {
			System.out.println(this.Number+ " is palindrome number");
		}
		else {
			System.out.println(this.Number+" is not Plaindrome number");
		}
		
	}
	
	public static void main(String [] args) {
		Palindromenumber1 object = new Palindromenumber1();
		object.method1(888878);
		object.method1(121);
		object.method1(353);
		object.method1(1234567);
	}
}
