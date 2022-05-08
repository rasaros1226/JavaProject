
package december22;

public class Forloop5 {
	int a=50;
	int b =100;
	
	public void method1() {
	
		for(int i = 0;i<=3;i++) {
			for(int j =0;j<=3;j++) {
				
			System.out.print(j +" "+ i+"\t ");
			
		}	
			System.out.println();
		}
	}
    public static void main(String [] args) {
    	Forloop5 object = new Forloop5();
    	object.method1();
    }

}
