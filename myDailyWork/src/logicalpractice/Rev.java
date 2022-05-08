package logicalpractice;

public class Rev {

	int N= 135;
	int N1=N;
	
	int a=0;
	int b=0;
	public void method1() {
		while(N!=0) {
			a=N%10; //135/10 = quotient 13  remainder 5 //13/10 q1 r3 q0r1
			b= b*10+a;//5 503
			N=N/10;//13 1
		}
		System.out.println(b);
	}
	public static void main(String[] args) {
		Rev obj =new  Rev();
		obj.method1();
	}
}
