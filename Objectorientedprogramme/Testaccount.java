package Objectorientedprogramme;

public class Testaccount {
	public static void main(String[] args) {
		Account account = new Account();
		int amount = 50000;
		account.setBalance(1000000);
		account.setnumber("5366587845");
		System.out.println("Account number" + account.getnumber());
		System.out.println(account.getBalance());
		account.deposit(amount, account);
	}}
