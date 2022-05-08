package palindrome;

public class PalindromeusingFor {

	public static void main(String[] args) {
		
		int Number=1221;
		int Number1=Number;
		int a=0;
		int b=0;
		
		for(int i=1;Number>0;i++) {
			a=Number%10;
			b=b*10+a;
			Number=Number/10;
		}
		if(b==Number1) {
			System.out.println(Number1+ "  is Palindrome Number");
		}
	}
}
