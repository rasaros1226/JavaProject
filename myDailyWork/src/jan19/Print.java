package jan19;

public class Print {

	
	int i=1;
	public void method() {
		
		if(i<=10) {
			System.out.println(i);
			i++;
			
		}
		
	}
	public void method1() {
		System.out.println("method1");
		method();
	}
	
	public static void main(String [] args) {
		Print obj = new Print();
		obj.method();
		obj.method1();
		
}
}
