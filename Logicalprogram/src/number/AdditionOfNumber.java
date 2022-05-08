package number;

public class AdditionOfNumber {

	public static void main(String[] args) {
		int number=98896346;
		int a=0;
		int b=0;
		int addition=0;
		int addition1=0;
				
		while(number!=0) {
		 a=number%10;
		 addition=addition+a;
		 number=number/10;
		}
		System.out.println(addition);
		if(addition>10) {
			while(addition!=0) {
				b=addition%10;
				addition1=addition1+b;
				addition=addition/10;
			}
		}
		if(addition1<10) {
			System.out.println(addition1);
		}
		
	}
	
	
}
