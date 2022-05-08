package jan26;

public class Pal {

	public void method() {
		for(int i=1000;i<=1300;i++) {
			int Number=i;
			int a=0;int b=0;
		while(Number!=0) {
			a=Number%10;
			b=b*10+a;
			Number=Number/10;
		}
		if(b==i) {
			System.out.println(i+" palindrome");
		}	
		}
	}
	public static void main(String[] args) {
		Pal obj = new Pal();
		obj.method();
	}
}
