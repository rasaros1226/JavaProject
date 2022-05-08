package jan26;

public class Evenodd {

	public void method() {
	int Number=11;
	
	if(Number%2==0) {
		System.out.println(Number+" is Even" );
	}
	else {
		System.out.println(Number + " is odd");
	}

	}
	public static void main(String[] args) {
		Evenodd obj = new Evenodd();
		obj.method();
	}
	}
