package Objectorientedprogramme;

public class Testaccountwithdrawal {
	public static void main(String[] args) {
		Account account = new Account();
		int amount= 2000;
		account.setBalance(1000000);
		account.setnumber("435896754373737");
		account.withdrawal(amount,account);
		account.setBalance(1000000);
		
	}

}
