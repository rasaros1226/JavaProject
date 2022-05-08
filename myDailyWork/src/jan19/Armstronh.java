package jan19;

public class Armstronh {

	int Number=123;
	int Number1=Number;
	int a=0;
	int b=0;
	public void method() {
		
		while(Number1!=0) {
			a=Number1%10;
			b=b+a*a*a;
			Number1=Number1/10;
			
		}
		if(b==Number) {
			System.out.println(Number +" is Armstrong");
		}
		
	}
	
	public static void main(String[] args) {
		Armstronh obj = new Armstronh();
		obj.method();
	}
	
}
