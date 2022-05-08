package december12;


public class Practice1 {

		int a = 21;
		String Name= "Hemant";
		long Mobile = 9975001100l;
		int b = 10;
		
		
		public void method1() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(Name);
			System.out.println(Mobile);
		}
		
		public static void method2() {
		
			int a= 20;
			Practice1 boss = new Practice1();
			System.out.println(boss.a);

			System.out.println(boss.b);
			System.out.println(boss.Name);
			System.out.println(boss.Mobile);
			System.out.println(a);
			
		}
		public static void main(String [] args) {
		Practice1 object = new Practice1();
		object.method1();
		method2();
		}

}
