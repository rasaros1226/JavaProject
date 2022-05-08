package arrayProgram;

public class AscendingWithoutSort {

	public static void main(String[] args) {
		
		int Number[] = {23,45,778,422,34,12,556,86,143,23,789};
                        //	                   
		
		int temp;
		for(int i=0;i<Number.length;i++) {
			for(int j=i;j<Number.length;j++) {
				temp=0;           
				if(Number[i]>Number[j])
				{
					temp=Number[i];           // temp =a
					Number[i]=Number[j];     //  a=b
					Number[j]=temp;          // b=temp
					
				}
			}
		}
		
		for(int i =0;i<Number.length;i++) {
			System.out.print(Number[i]+" " );
		}
	   	
	   
	   	
	   System.out.println("\n"+Number[0]);
	
	}
	
	
}
