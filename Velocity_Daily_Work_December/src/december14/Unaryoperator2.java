package december14;

public class Unaryoperator2 {

	public void method1(int a,int b) {
	
		//-(n+1) is formula
		
		System.out.println(a); //20    
		System.out.println(b); //50          S
		System.out.println(~a); //-21   
		/* when a =10
		   -(n+1)
		   -(a+1)
		   -(10+1)
		   -(11)
		   -11 
		*/
		
		System.out.println(~b); //-51 
		/* when b = -20
		   -(n+1)
		   -(b+1)
		   -((-20)+1)
		   -(-19)
		    19  
		*/
		
		System.out.println(~(a+b));	//-71 
		/*   when a = 10, b=-20
		   -(n+1)
		   -((a+b)+1)
		   -((10+(-20)+1) 
		   -(-10+1)S
		   -(-9)
		      9
		 */
	}
	
	public static void main(String [] args) {
		Unaryoperator2 object = new Unaryoperator2();
		object.method1(20,50);
		object.method1(10,-20);	
	}
}

