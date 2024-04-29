package encapuslation;

public class B_ACCOUNT {

	public static void main(String[] args) {
		A_Account a=new A_Account();
		a.getBalance(1234);
		a.setBalance(1234, 987654321, 20000);
		a.getBalance(1234);
				
	}

}
