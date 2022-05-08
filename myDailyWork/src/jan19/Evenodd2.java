package jan19;

public class Evenodd2 {

	public void method1() {
		
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				System.out.println(i+"Number is Even");
			}
		}
	}
	
	public static void main(String [] args) {
		Evenodd2 obj = new Evenodd2();
		obj.method1();
	}
}
