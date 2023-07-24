class Account 
{
	private int accountNo;
	private String name;
	private double balance;
	public Account() {}
	public Account(int accountNo, String name, double balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public double getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
