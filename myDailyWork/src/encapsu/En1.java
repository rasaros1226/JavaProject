package encapsu;

public class En1 {

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setBankBalance(30000);
		int balance=obj.getBankBalance();
		System.out.println(balance);
	}
}
