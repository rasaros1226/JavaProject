package december23;

public class Reversenumber {

	public static void main(String[] args) {
		int n=689;
		
		int a=n/100;
		System.out.println(a);
		int b = n-a*100;
		System.out.println(b);
		int c =b/10;
		System.out.println(c);
		int d=b-c*10;
		System.out.println(d);
		int e= d*100+c*10+a;
		System.out.println(e);
	}
	
}
