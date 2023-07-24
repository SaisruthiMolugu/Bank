import java.time.LocalDate;
 class Account {
	private int accountNo;
	private LocalDate opendate; 
	private double balance;
	private String accountholdername;
	public Account() {}
	public Account(int accountNo, double balance,String accountholdername,LocalDate opendate) {
		this.accountNo = accountNo;
		this.opendate = opendate;
		this.balance = balance;
		this. accountholdername= accountholdername;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public LocalDate getOpendate() {
		return opendate;
	}
	public void setOpendate(LocalDate opendate) {
		this.opendate = opendate;
	} 
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}





}