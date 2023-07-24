import java.time.LocalDate;

class CurrentAccount extends Account {
	int overdraftLimit;;

	public CurrentAccount() {}
	public CurrentAccount(int accountNo, double balance,String accountholdername,LocalDate opendate,int overdraftlimit)
	{
	super(accountNo, balance, accountholdername, opendate);
	this.overdraftLimit = (overdraftLimit);
	}
	public int getOverdraftLimit() {
		return overdraftLimit;
	}
	public void setOverdraftLimit(int overdraftLimit) {
		this.overdraftLimit = (overdraftLimit);
	}
	/*private int validateOverdraftLimit(int overdraftLimit)
	{
		if(overdraftLimit<1000)
			return overdraftLimit;
		throw new OverDraftLimitException("You reached the limit");
	}*/
	



}