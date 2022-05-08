package practiceformock;

public class Practiceone {

		public void method1(int a,int b,int c){
		 if(a>b && b>c){

		  System.out.println("a is greater than b and b is greater than c");
		}
		 else {
		  System.out.println("C is greater tha a and b");
		}


		}

		public static void main(String [] args){
		Practiceone object = new Practiceone();
		object.method1(1290,23,3);
		object.method1(120,234,455);
		}



		
}
