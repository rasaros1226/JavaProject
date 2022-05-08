package december13;

public class Unaryoperator {

	int a = 10;
	
	public void method1() {
	
		System.out.println(a);   //10
		System.out.println(a++); //10
		System.out.println(++a);//12
		System.out.println(a); //12
		System.out.println(a++);//12
		System.out.println(++a); //14 
		System.out.println(a++);// 14
		System.out.println(a++);// 15
		System.out.println(a--);// 16
		System.out.println(a);//15
		System.out.println(--a);//14
		System.out.println(a--);//14
		System.out.println(a++);//13
		System.out.println(+a);//14
		System.out.println(-a);//-14
	}
	public static void main(String [] args) {
		Unaryoperator object = new Unaryoperator();
		object.method1();
		
		
		
	}
}
