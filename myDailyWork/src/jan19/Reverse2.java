package jan19;

public class Reverse2 {

	public void method1() {
		
		for(int i=1000;i<=2000;i++) {
			int Number=i;
			int a=0;
			int b=0;
			while(Number!=0) {
				a=Number%10; //1000/10 0 100%10 0 10%10 0 1%10 1 
				b=b*10+a; //0  0 0  1
				Number=Number/10;//100 10 1  0
			}
			if(b==i) {
				System.out.println(i+" Number is palindrome");
			}
		}
		
	}
	public static void main(String [] args) {
		Reverse2 obj = new Reverse2();
		obj.method1();
	}
}
