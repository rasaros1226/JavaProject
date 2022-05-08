package reversenumber;

public class Reversenumber1 {

	int Number=123;
	int a;
	int b=0;
	
	public void method1() {
	  while(Number!=0) {
		
		  a = Number%10;      // 
		  b = b*10+a;         //
		  Number=Number/10;   //
		  
	  }
	  System.out.println("Reverse number is " + b);
	}
	
	public static void main(String [] args) {
	Reversenumber1 object = new Reversenumber1();
	object.method1();
	}
	
}
