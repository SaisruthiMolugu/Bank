import java.time.LocalDate;

class SavingsAccount extends Account {
	public static final double minimumDepositAmount =1000;
	public static final int nooftransactions=100;
	public SavingsAccount() {}
	public SavingsAccount(int accountNo, double balance,String accountholdername,LocalDate opendate)
	{
	super(accountNo, balance, accountholdername, opendate);
	}


}