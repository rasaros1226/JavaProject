package december24;

public class Dowhile {

	int i=  1;
	public void method1() {
	
		do {
			System.out.println(i);
			i++;
			
		}while(i<=10);
		
	}
	
	int j =20;
	public void method2() {
		do {
			System.out.println(j);
			j--;
		}while(j>=1);
		
	}
	
	public static void main(String [] args) {
		Dowhile object = new Dowhile();
		object.method1();
		object.method2();
	}
}

