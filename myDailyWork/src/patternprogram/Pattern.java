package patternprogram;

public class Pattern {
	int n=5;
	public void method1() {
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method2() {
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n-1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
}
			System.out.println();
		}
	}
	
	public void method3() {
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=i-1;k++) {
			System.out.print(" ");
			}
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Pattern p = new Pattern();
		
		p.method2();
		p.method3();
	}
}
