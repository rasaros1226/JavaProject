package december22;

public class Forloop3 {

	int a=0;

	public void method1() {
		for(int i=1;i<=10;i++) {
		a=a+1;
		System.out.print(a);
		System.out.println("\t"+i);
		}
	}
	public static void main(String [] args) {
		Forloop3 object = new Forloop3();
		object.method1();
		
	}
}
