package patternprogram;

public class Patternprogram15 {

	public void method1() {
	int n=11;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(i==1||j==1||i==11||j==11||i==j||j==n-i+1) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	}
	
	public static void main(String [] args) {
	Patternprogram15 object = new Patternprogram15();
	object.method1();	
	}
}


