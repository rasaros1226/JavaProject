package jan19;

public class Prime2 {

	
	public void method() {
		for(int i=1000;i<1200;i++) {
			int Number=i;
			int Count=0;
			for(int j=2;j<Number;j++) {
				if(Number%j==0) {
					Count=1+Count;
				}	
			}
			if(Count!=0) {
				System.out.println(Number+" is Not prime");
			}
			
		}
	}
	public static void main(String [] args) {
		Prime2 obj = new Prime2();
		obj.method();
	}
}
