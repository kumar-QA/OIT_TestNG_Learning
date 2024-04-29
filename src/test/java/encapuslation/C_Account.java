package encapuslation;

public class C_Account {

	public static void main(String[] args) {
		A_Account a=new A_Account();
		System.out.println(a.balance);
		a.balance=10000;
		System.out.println(a.balance);
	}

}
