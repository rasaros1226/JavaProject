package primenumber;

public class Primenumber2 {

	public void method1() {
	int number =19;
	int count=0;
	for(int i =2;i<=number-1;i++) {
		if(number%i==0) {
			count=count+1;
		}	
	}
	if(count==0) {
		System.out.println(number + " Number is prime");
	}
	else {
		System.out.println(number+ " Number is not prime");
	}	
}
	
	public static void main(String[] args) {
		Primenumber2 object = new Primenumber2();
		object.method1();
	}
}