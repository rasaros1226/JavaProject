package december8;

public class Constructorcalling {

	public Constructorcalling() {
		System.out.println("Zero argument constructor is running");
		
		
	}
	
	public Constructorcalling(int a) {
		System.out.println("one argument constructor is running");
		System.out.println(a);
	}
	
	public Constructorcalling(int a, int b) {
		System.out.println("Two argument constructor is running");
		
		System.out.println(a+b);
		
	}
	
	public Constructorcalling(int a, float b , String t) {
		System.out.println("Three argument constructor is running");
		
	}
	
	public static void main(String [] args) {
		new Constructorcalling(4545,121,"Hello peter");
		new Constructorcalling();
		new Constructorcalling(12);
		new Constructorcalling(12,32);
		new Constructorcalling();
		new Constructorcalling(0);
        new Constructorcalling(15,30);
		new Constructorcalling();

		
		
	}
	
}
