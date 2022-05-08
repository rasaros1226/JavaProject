package jan21;

public class ExecutionClass extends ImplementClass {

	public static void main(String[] args) {
		ExecutionClass obj = new ExecutionClass();
		obj.launchChromeDriver();
		d.close();
		obj.launchEdgeDriver();
		d.close();
		obj.launchFirefoxDriver();
		d.close();
		
		
	}
}
