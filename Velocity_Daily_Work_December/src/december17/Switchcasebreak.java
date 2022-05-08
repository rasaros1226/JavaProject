package december17;

public class Switchcasebreak {

	int a;
	
	public void method1(int a) {
		this.a = a;
		
		switch(a) {
		case 1:System.out.println("today is a monday");break;
		case 2:System.out.println("today is a tuesday");break;
		case 3:System.out.println("today is a wednesday");break;
		case 4:System.out.println("today is a thursday");break;
		case 5:System.out.println("today is a friday");break;
		case 6:System.out.println("today is a saturday");break;
		case 7:System.out.println("today is a sunday");break;
		
		default:System.out.println("please enter valid number");break;
		}
	}
	
	public static void main(String [] args) {
	
		Switchcasebreak object = new Switchcasebreak();
		object.method1(3);
		object.method1(0);
		object.method1(33);
		object.method1(7);
		object.method1(1);
		object.method1(4);
	
}
}