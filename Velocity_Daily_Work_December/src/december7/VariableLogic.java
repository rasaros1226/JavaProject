package december7;

public class VariableLogic {
   static  int a= 20;
   static  int b =50;
   
   
   public static void hemant() {
	System.out.println(a+b);   
	   
   }
  
   public void hemant2() {
	System.out.println(a);
	System.out.println(b);
   }
   
   public static void main(String [] args) {
	hemant();
	VariableLogic object = new VariableLogic();
	object.hemant2();
	   
   }
	
	
}
