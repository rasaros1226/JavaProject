package stringProgram;

public class StringMethods {

	public static void main(String[] args) {
		
		String s1= "Hemant Ahire";
		String s2="";
		String s3 = "i love india";
		
		//to check string is empty or not
		System.out.println(s1.isEmpty());//false
		System.out.println(s2.isEmpty());//true
		
		//to check length of string(count everything between " ")
		System.out.println(s1.length());
		
		//to print in upper case
		System.out.println(s1.toUpperCase());
		
		//to print in lower case
		System.out.println(s1.toLowerCase());
		
		//to check starting letter present or not
		System.out.println(s1.startsWith("Hm"));//false
		System.out.println(s1.startsWith("Hem"));//true
		
		//to check ending letter present or not
		System.out.println(s1.endsWith("hre"));//false
		System.out.println(s1.endsWith("re"));//true
		
		//to concatinate the string
		System.out.println(s1.concat(" is a Engineer"));
		
		//to find  index of char (Start to end whenever we get index) 
		System.out.println(s3.indexOf("i"));//0
		
		//to find  index of char (end to start whenever we get index) 
		System.out.println(s3.lastIndexOf("i"));//10
		
		//to give index by char
		System.out.println(s3.charAt(5));//e
		
		//to print from given index to last index
		System.out.println(s3.substring(2));
		
		//to print from 1st given index to 2nd given index 
		System.out.println(s3.substring(5,8));
		
		//to replace string with new word
		System.out.println(s3.replaceAll("india","You"));
		
		
		//split the word on the basis of which we have pass
		String[] a= s3.split(" ");
		System.out.println(a[2]);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		
	}
}
