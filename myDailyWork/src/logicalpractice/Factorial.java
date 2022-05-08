package logicalpractice;

public class Factorial {

	int Number=12;
	int Factorial=1;
	
	public void method1() {
		for(int i=1; i<=Number; i++)
		{
			 Factorial=Factorial*i;	
		}
		
		System.out.println(Factorial);
	}
	public static void main(String[] args) {
		Factorial obj  = new Factorial();
		obj.method1();
	}
	
}
