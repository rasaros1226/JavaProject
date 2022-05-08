package armstrongnumber;

public class Armstrong1 {
	//0, 1, 153, 370, 371 and 407 1634, 8208 and 9474
	public void method1() {
		
	
	int Number =153;
	int temp =Number;
	int a=0;
	int b=0;
	
	while(temp!=0) {
		a=temp%10;
		b=b+a*a*a;
		temp=temp/10;
		
	}
	System.out.println(b);
	if(Number==b) {
		System.out.println("Armstrong Number");
	}
}
	public static void main(String[] args) {
		Armstrong1 object = new Armstrong1();
		object.method1();
	}
}