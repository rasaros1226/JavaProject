package primenumber;

import java.util.Scanner;

public class Primenumber1 {

	public void method1() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value ");
	    int Number=s.nextInt();
	    int a=0;
	    
	    for(int i=2;i<=Number-1;i++) {
	    
	    	if(Number%i==0) {
	    		a=a+1;
	    		
	    	}
	    	
	    }
	    if(a==0) {
	    	System.out.println(Number+" Number is  Prime number");
	    }
	    else {
	    	System.out.println(Number +" Number is Not prime");
	    }
	
	    s.close();    
	}
	
	public static void main(String [] args) {
		Primenumber1 object = new Primenumber1();
		object.method1();
	}
}
