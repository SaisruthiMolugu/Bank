import java.time.LocalDate;

public class TestAccount {
	public static void main(String[] args)
	{
		//LocalDateTime opendate = new LocalDateTime(opendate.getDayOfMonth()+"/"+opendate.getMonth()+"/"+opendate.getYear());
		Bank1 b =new Bank1("State Bank of India","YGT");
		b.addAccount(new SavingsAccount(23456,25000,"Sruthi",LocalDate.of(2020, 11, 4)));
		b.addAccount(new SavingsAccount(23466,45000,"Sushma",LocalDate.of(2020, 12, 4)));
		b.addAccount(new SavingsAccount(23476,35000,"jaya",LocalDate.of(2020, 8, 4)));
		b.addAccount(new SavingsAccount(23486,65000,"Sree",LocalDate.of(2020, 6, 4)));
		b.addAccount(new SavingsAccount(23496,55000,"Chandu",LocalDate.of(2020, 3, 4)));
		b.addAccount(new CurrentAccount(23496,75000,"Kala",LocalDate.of(2020, 8, 4),10000));
		b.addAccount(new CurrentAccount(23356,95000,"Sai",LocalDate.of(2021, 12, 4),20000));
		b.addAccount(new CurrentAccount(23556,85000,"Munna",LocalDate.of(2022, 12, 4),30000));
		b.addAccount(new CurrentAccount(23656,15000,"ajay",LocalDate.of(2020, 10, 4),40000));
	    b.addAccount(new CurrentAccount(23756,26000,"Ramu",LocalDate.of(2020, 9, 4),55000));
		b.showAccounts();
		try
		{
			//b.addAccount(new SavingsAccount(33756,26000,"Rama",LocalDate.of(2020, 9, 3)));
			//b.transaction('d',23456,100000);
			//b.transaction('w',23456,100000);
			//b.transaction('d',23466,100000);
			b.transaction('w',23756,650000);
		}
		catch(RuntimeException ex)
		{
			System.out.println(ex);
		}


	}

}