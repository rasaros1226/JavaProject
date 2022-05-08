package logicalpractice;

public class Evenodd {

	
	
	
	public void method1() {

		for(int i=1000;i<=1200;i++) {
		int a=i;
		if(a%2==0) {
		System.out.println(a+" is a even number");
		}
		else {
			System.out.println(a+ " is odd number");
		}
		}
	}
	
	public static void main(String [] args) {
		Evenodd object = new Evenodd();
		object.method1();
	}
}
