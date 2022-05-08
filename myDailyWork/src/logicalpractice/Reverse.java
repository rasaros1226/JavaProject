package logicalpractice;

public class Reverse {

	int Number=223;
	int Number1=Number;
	int a=0;
	int b=0;
	public void method1() {
		while(Number1!=0){
			a=Number1%10;
			b=b*10+a;
			Number1=Number1/10;
}
		
			System.out.println(b+" is reverse number");
		
			if(b==Number) {
				System.out.println(b +" is Palindrome number");
			}
	}
	
	public static void main(String [] args) {
		Reverse object = new Reverse();
		object.method1();
	}
			
}
