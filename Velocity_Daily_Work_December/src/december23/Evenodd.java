package december23;

public class Evenodd {

	int a=500;
	int b= 1000;
	public void method1() {
		for(int i=a;i<=b;i++) {
			
			if(i%2==0) {
				System.out.print(i +" is Even number"+"\t");
			}
			else {
				System.out.println(i +" is Odd number");
			}

		}
		
	}
	public static void main(String [] args) {
		Evenodd object = new Evenodd();
        object.method1();	
	}
	
}
