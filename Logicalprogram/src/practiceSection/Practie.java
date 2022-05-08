package practiceSection;

public class Practie {

	static int number= 153;
	static int a=0;
	static int b=0;
	public static void main(String [] args) {
		int temp=number;
		while(number!=0) {
		a= number%10;	
		b=b+a*a*a;	
		number=number/10;
		}
		
		if(b==temp) {
			System.out.println("Armstrong number");
		}
		
		
		
		
	}
	
}
