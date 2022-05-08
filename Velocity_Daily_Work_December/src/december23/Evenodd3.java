package december23;

public class Evenodd3 {

	public void method1(int a,int b) {
		System.out.println("Even numbers between 500 to 1000 are");
		System.out.println();
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				System.out.print(i + "\t");
			}
			
		}
	System.out.println();	
	System.out.println("\nOdd numbers between 500 to 1000 are");	
	System.out.println();
	    for(int i=a;i<=b;i++) {
	    	if(i%2!=0) {
	    		System.out.print(i + "\t");
	    	}
	    }
	}
	
	public static void main(String [] args) {
	Evenodd3 object = new Evenodd3();
	object.method1(500,1000);
	}
	
}


