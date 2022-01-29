package Objectorientedprogramme;

public class Testaccountpaybill {
public static void main(String[] args) {
	Account account=new Account();
	int amount= 300;
	account.paybill(account,amount);
	account.setBalance(100000);
	account.setnumber("5680089878786");
}
}
