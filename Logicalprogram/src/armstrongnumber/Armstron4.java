package armstrongnumber;

public class Armstron4 {

	public static void main(String[] args) {
		
		int number=153;
		int number2=number;
		int a=0;
		int b=0;
		int count=0;
		
		while(number!=0){
			
			number=number/10;
			count++;
		}
		System.out.println(count);
		
		while(number2!=0) {
		 a=number2%10;
		 b=b+a*count;
		 number2=number2/10;
		}
		System.out.println(b);
		
	}
}



