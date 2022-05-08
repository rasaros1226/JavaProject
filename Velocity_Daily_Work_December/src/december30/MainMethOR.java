package december30;

public class MainMethOR {

	public static void main(String [] args) {
		MethOR object2 =  new MethOR();
		object2.add();
		object2.sub(4, 2);
		object2.mul(10,10,10);
		
		
		MethOR1 object = new MethOR1();
		object.add();
		object.mul(2, 4, 6);
		object.sub(2, 1);
		
		MethOR2 object1 = new MethOR2();
		object1.add();
		object1.sub(10, 5);
		object1.mul(2, 1, 3);
	}
}
