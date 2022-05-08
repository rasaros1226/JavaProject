package jan27;

public class Swapping {

	public static void main(String[] args) {
		int Number=153;
		int a=0;
		int b=0;
		
		while(Number!=0){
		a=Number%10;
		b=b+a*a*a;
		Number=Number/10;
		
		}
		System.out.println(b);
		
	}
	
}
