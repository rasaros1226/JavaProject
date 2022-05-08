package december7;

public class Instancevariable1 {

	//declaration + initialization of variable
	int a = 21;
	String Name= "Hemant";
	long Mobile = 9975001100l;
	int b = 10;
	
	//non static method here we are accessing instance variable directly
	public void method1() {
		  
	System.out.println(a);
	System.out.println(b);
	System.out.println(Name);
	System.out.println(Mobile);
	}
	
	//static method and we are accessing instance variable with the object
	public static void method2() {
	//local variable declaration + initialization
	int a= 20;
	
	//object creation
	Instancevariable1 boss = new Instancevariable1(); 
	System.out.println(boss.a); //accessing instance variable objectrefvariable.variable 
	System.out.println(boss.b);
	System.out.println(boss.Name);
	System.out.println(boss.Mobile);
	
	System.out.println(a); // accessing local variable
		
	}
	
	//main method and we are accessing instance variable with the object
	public static void main(String [] args) {
		
	//object creation	
	Instancevariable1 object = new Instancevariable1();
	
	object.method1();//non static method calling
	
	System.out.println(object.a);//instance variable accessing with help object refference variable
	System.out.println(object.b);
	System.out.println(object.Name);
	System.out.println(object.Mobile);
	
	method2();//static method calling
	}

}
