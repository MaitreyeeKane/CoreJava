package Objectorientedprogramme;

public class Account {
	private String number2;
	private String number;
	private String accounttype;
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getnumber() {
		return number;
	}

	public void setnumber(String Number) {
		number = Number;
	}

	public String getNumber2() {
		return number2;
	}

	public void setNumber2(String number2) {
		this.number2 = number2;
	}

	public String getAccountType() {
		return accounttype;
	}

	public void getAccounttype(String Accounttype) {
		accounttype = Accounttype;
	}

	public void deposit(int amount, Account account) {
		String accountNumber = account.getnumber();
		double mainBalance = account.getBalance();
		account.setnumber(accountNumber);
		account.setBalance(amount + mainBalance);
		System.out.println("Account number" + account.getnumber());
		System.out.println(account.getBalance());
	}

	

	public void fundtransfer(int amount, Account account) {
		System.out.println(balance-=amount);
		account.getBalance();
	 double bal = account.getBalance();
	 account.setBalance(bal+amount);
	}

	public void paybill(Account account, int amount) {
		String accountnumber = account.getnumber();
		double mainBalance = account.getBalance();
		account.setnumber(accountnumber);
		account.setBalance(mainBalance-amount);
		System.out.println("Account number" + account.getnumber());
		System.out.println(account.getBalance());
	}

	public void withdrawal(int amount, Account account) {
		String accountnumber = account.getnumber();
		double mainBalance = account.getBalance();
		account.setnumber(accountnumber);
		account.setBalance(mainBalance-amount);
		System.out.println("Account number" + account.getnumber());
		System.out.println(account.getBalance());
	}

	
}
