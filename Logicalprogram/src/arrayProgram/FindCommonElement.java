package arrayProgram;

public class FindCommonElement {

	public static void main(String[] args) {
		
		int Number[] = {1,2,3,4,5};
		int Number2[]= {5,6,7,8,2};
		
		System.out.print("The common Numbers are :");
		
		for(int i=0;i<Number.length;i++) {
			for(int j=0;j<Number2.length;j++) {
				if(Number[i]==Number2[j]) {
					System.out.print(Number[i] + " ");
				}
			}
		}
		
		
	}
}
