class Bank1 {
		private String bankName;
		private String branchName;
		private Account[] accounts;
		 SavingsAccount sa;
		 CurrentAccount ca;
		int index;
		public Bank1() {}
		public Bank1(String bankName, String branchName,Account[] accounts) {
			this.bankName = bankName;
			this.branchName = branchName;
			this.accounts = accounts;
		}
		public String getBankName() {
			return bankName;
		}
		public void setBankName(String bankName) {
			this.bankName = bankName;
		}
		public String getBranchName() {
			return branchName;
		}
		public void setBranchName(String branchName) {
			this.branchName = branchName;
		}
		public SavingsAccount getsa() {
			return sa;
		}
		public void setSa(SavingsAccount sa) {
			this.sa = sa;
		}

		public CurrentAccount getCa() {
			return ca;
		}
		public void setCa(CurrentAccount ca) {
			this.ca = ca;
		}
		public boolean addAccount(Account accountno)
		{
			for(int i=0;i<=index;i++)
				if(index<accounts.length)
				{
					accounts[index++]=accountno;
					return true;
				}
			throw new RuntimeException("No more accounts can be added");

		}
		public void showAccounts()
		{
			for(int i=0;i<index;i++)
			{
				System.out.println("Account number :"+accounts[i].getAccountNo());
				//System.out.println("Account opening date :" +accounts[i].getOpendate());
				System.out.println("Balanec :"+accounts[i].getBalance());
				System.out.println("Account holder name :" +accounts[i].getAccountholdername());


			}
		}
		public void transaction(char type,int accountNumber,double amount)
{
			double finalamount;
			double  overdraft =0;
			for(int i=0;i<index;i++) 
	{
				int number=0;
if(accounts[i].getAccountNo() == accountNumber)
{
     if(accounts[i].getAccounttype()=="sa")
	   {	
			if(type== 'd') 
			{
				finalamount = accounts[i].getBalance()+amount;
				System.out.println("Remaining amount = "+finalamount);
				number++;
			}	
			else 
			{
				
					if(accounts[i].getBalance() > sa.minimumDepositAmount)
					{
						finalamount	 =accounts[i].getBalance()- amount;	
						System.out.println("Remaining amount = "+finalamount);
					number++;
					}
				throw new InsufficientBalanceException("There are insufficient funds in your account");
			}
		     	if(number>sa.nooftransactions)
		     		throw new ReachedmaxnumberofTransactionExceptions("You have reached maximum transactions of today");

		}
     else 
		{
	    	if(type== 'd') 
	     	{
				finalamount = accounts[i].getBalance()+amount;
				System.out.println("Remaining amount = "+finalamount);
			}	
			else 
			{
				if(accounts[i].getBalance() >amount)
				{
				    finalamount	 =accounts[i].getBalance()- amount;
				    System.out.println("Remaining amount = "+finalamount);
				}

				 else
				 {
					 if(overdraft < ca.overdraftLimit )
					    finalamount	 =accounts[i].getBalance()- amount;
					 throw new OverDraftLimitException("You have reached the limit,no more funds cannot be given");

				 } 
		     }
		}	

	}
	}
}
}