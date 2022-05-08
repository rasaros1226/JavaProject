package december14;

public class Shiftoperator {

	public void method1(int a, int b , int c, int d) {
		// << = a*2^n
		
		/*
		 * a = 2
		 * 
		 * 2*2^2=8
		 * 
		 */
		
		
		
		
		System.out.println(a << 1);
		System.out.println(a << 2);
		System.out.println(a << 3);
		System.out.println(a << 4);
		System.out.println(a << 5);
		
		
		// << = b *2^n
		
		System.out.println(b << 1);
		System.out.println(b << 2);
		System.out.println(b << 3);
		System.out.println(b << 4);
		System.out.println(b << 5);
		
		//  >> = c/2^n
		
		System.out.println(c >> 1);
		System.out.println(c >> 2);
		System.out.println(c >> 3);
		System.out.println(c >> 4);
		System.out.println(c >> 5);
		
		// >> = d/2^n
		

		System.out.println(d >> 1);
		System.out.println(d >> 2);
		System.out.println(d >> 3);
		System.out.println(d >> 4);
		System.out.println(d >> 5);
		
		//>>> Right shift operator
		System.out.println(d >>> 1);
		System.out.println(d >>> 2);
		System.out.println(d >>> 3);
		System.out.println(d >>> 4);
		System.out.println(d >>> 5);


	}
	
	public static void main(String [] args) {
		
		Shiftoperator object = new Shiftoperator();
		object.method1(2,25,2,25);
		
		
	}
}
