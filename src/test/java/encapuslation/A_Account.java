package encapuslation;

public class A_Account {

	private int balance=50000;
	
	void getBalance(int pinno){
		if(pinno==1234) {
			System.out.println(balance);
		}else {
			System.err.print("enter valid pinno");
		}
	}
	
	void setBalance(int pinno,int accountno,int amount){
		if(pinno==1234&& accountno==987654321) {
			balance=balance-amount;
		}else {
			System.err.print("enter valid pinno");
		}
	}
	
	
	
	public static void main(String[] args) {
		A_Account aa=new A_Account();
	 System.out.println(aa.balance);
	}

}
