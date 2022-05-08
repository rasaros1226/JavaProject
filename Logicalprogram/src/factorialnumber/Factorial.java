package factorialnumber;

public class Factorial {
	
	public void method1() {
		  int Number = 6;
		  double fact=1;  //1*2*3*4*5*6
		    
		for (int i=1; i<=Number; i++) {  //5times              
			 fact =fact*i; //1*1=1*2=2*3=6*4=24*5=120*6= 720
		}
		
	        System.out.println("factorial of "+ Number +" is " + fact);	
	    }
	
	public static void main (String[]args) {
		Factorial object = new Factorial();
		object.method1();
	}
	}