package december2;

public class Primitive_variable {
   
	//main method
	public static void main(String [] args) {
		//object declaration
		Primitive_variable Object = new Primitive_variable();
		
		//non static method calling
		Object.typeofvariable();
	}
	
	//non static method
	public void  typeofvariable() {
		//declaration + initialization of local variable
		int a = 12121212; // integer
		short A = 1212;   // short
		long b = 12121212111121l; //long
		char B = 'b';  //char
		char C = 'C';  //char
		char f ='@';   //char
		byte c = 123;  //byte
		boolean abcd = 10> 12; //boolean
		
			
		System.out.print("value of a i.e int: ");;
		System.out.println(a);
		System.out.print("VAlue of A i.e short : ");
		System.out.println(A);
		System.out.print("Value of b i.e long : ");
		System.out.println(b);
		System.out.print("value of B i.e char: ");
		System.out.println(B);
		System.out.print("value of C i.e char: ");
		System.out.println(C);
		System.out.print("value of f i.e char: ");
		System.out.println(f);
		System.out.print("value of c i.e byte: ");
		System.out.println(c);
		System.out.print("the conditional information of abcd: ");
	    System.out.println(abcd);
	
	
	}
	
	
}
