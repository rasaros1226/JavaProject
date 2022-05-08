package jan26;

public class Swapp {

	int a=10;
	int b=20;
	int temp=0;
	public void method() {
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Swapp obj = new Swapp();
		obj.method();
	}
}
