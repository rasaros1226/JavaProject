package naturalnumbers;

public class Naturalnumber {

	public void method1() {
		System.out.println("first Natural Number are");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		Naturalnumber object = new Naturalnumber();
		object.method1();
	}
}
