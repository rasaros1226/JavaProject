package practiceformock;

public class Practiceone2 {
	
	int a;
	int b;
	
	public void method1(int a, int b) {
		this.a = a;
		this.b = b;
		/*
		 *  printing first then perform increment
		 */
		System.out.println(a++);//10
		System.out.println(a);//11
		System.out.println(a++);//11
        System.out.println(a++);//12
		System.out.println(a);//13
		/*
		 * first perform increment then print
		 */
		System.out.println(++a);//14
		System.out.println(a);//14
		System.out.println(++a);//15
		System.out.println(++a);//16
		System.out.println(a);//16
		System.out.println(++a);//17
		System.out.println(a);//17
		
		System.out.println(b--);//20
		System.out.println(++b);//20
		System.out.println(++b);//21
		System.out.println(b++);//21
		System.out.println(--b);//21
		System.out.println(b++);//21
		System.out.println(b--);//22
		System.out.println(b--);//21
		System.out.println(b);//20
		System.out.println(b++);//20
		System.out.println(--b);//20
		System.out.println(--b);//19
		System.out.println(b);//19
		
		
		System.out.println(-b);
		System.out.println(-a);
		System.out.println(+a);
		System.out.println(+a);
	}
	
	public static void main(String [] args) {
		Practiceone2 object = new Practiceone2();
		object.method1(10,20);
	}
	
}
