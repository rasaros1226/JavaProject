package jan26;

public class Reve {

	public void method() {
		int Number=323;
		int Number1=Number;
		int a=0;int b=0;
		while(Number1!=0) {
			a=Number1%10;
			b=b*10+a;
			Number1=Number1/10;
			
		}
		System.out.println(b);
		if(Number==b) {
			System.out.println(Number + " palindrome");
		}
		
		
	}
	public static void main(String[] args) {
		Reve obj = new Reve();
		obj.method();
	}
}
