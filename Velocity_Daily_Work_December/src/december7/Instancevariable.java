package december7;

public class Instancevariable {
	int b =12;
	float c = 3232;
	
	public void method() {	
	System.out.println(b-c);
	System.out.println(b+c);
	System.out.println(b*c);
	System.out.println(c/b);
	}
	
	public static void hemant() {
		
		
		
	}
    public static void main(String [] args) {   	
    Instancevariable object = new Instancevariable();	
    hemant();
    object.method(); 
    System.out.println(object.c);	
    }
}
