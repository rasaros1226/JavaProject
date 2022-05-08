package jan26;

public class Armstrong {

	int Number=371;   // 3^3=27  7^3=343 1^1=1  344+27=  371
	int Number1=Number;
	int a=0;int b=0;
	
	
	public void method() {
	
		while(Number!=0) {
			a=Number%10;
			b=b+a*a*a;
			Number=Number/10;
		}
		if(Number1==b) {
			System.out.println(Number1+" is Armstrog Number");
		}
	}
	public static void main(String[] args) {
		Armstrong obj = new Armstrong();
		obj.method();
	}
}
