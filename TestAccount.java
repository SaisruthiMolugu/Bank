import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestAccount {
	public static void main(String[] args)
	{
		//LocalDateTime opendate = new LocalDateTime(opendate.getDayOfMonth()+"/"+opendate.getMonth()+"/"+opendate.getYear());
		Bank1 b =new Bank1("State Bank of India","YGT",new Account[10]);
		b.addAccount(new Account(23456,25000,"Sruthi","sa",LocalDate.of(2020, 11, 4)));
		b.addAccount(new Account(23466,45000,"Sushma","ca",LocalDate.of(2020, 12, 4)));
		b.addAccount(new Account(23476,35000,"jaya","sa",LocalDate.of(2020, 8, 4)));
		b.addAccount(new Account(23486,65000,"Sree","ca",LocalDate.of(2020, 6, 4)));
		b.addAccount(new Account(23496,55000,"Chandu","sa",LocalDate.of(2020, 3, 4)));
		b.addAccount(new Account(23496,75000,"Kala","sa",LocalDate.of(2020, 8, 4)));
		b.addAccount(new Account(23356,95000,"Sai","ca",LocalDate.of(2021, 12, 4)));
		b.addAccount(new Account(23556,85000,"Munna","sa",LocalDate.of(2022, 12, 4)));
		b.addAccount(new Account(23656,15000,"ajay","ca",LocalDate.of(2020, 10, 4)));
	    b.addAccount(new Account(23756,26000,"Ramu","ca",LocalDate.of(2020, 9, 4)));
		b.showAccounts();
		try
		{
			//b.addAccount(new Account(33756,26000,"Rama","ca",LocalDate.of(2020, 9, 3)));
			//b.transaction('d',23456,100000);
			//b.transaction('w',23456,100000);
			//b.transaction('d',23466,100000);
			b.transaction('w',23466,650000);
		}
		catch(RuntimeException ex)
		{
			System.out.println(ex);
		}


	}

}