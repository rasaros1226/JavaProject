package palindrome;

public class Palindrome3 {

	
	public static void main(String [] args) {
		for(int i=1;i<=100;i++) {
			int n=i;
			int r=0;
			int a=0;
			
			while(n!=0) {
				r=n%10;
				a=a*10+r;
				n=n/10;	
			}
			if(i==a) {
				System.out.println(i +" is palindrome");
			}
		}
	}
}
