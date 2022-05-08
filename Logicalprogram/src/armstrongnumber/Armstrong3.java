package armstrongnumber;

public class Armstrong3 {

	public static void main(String[] args) {
		for(int i=100;i<999;i++) {
			int Number=i;
			int a=0;
			int b=0;
			while(Number!=0) {
				a=Number%10;
				b=b+a*a*a;
				Number=Number/10;
			}
			if(b==i) {
				System.out.println(i+" Armstrong Number");
			}	
		}	
	}
}
