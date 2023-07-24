package Assignment;

public class Validateage {
	public static void Valid(int age)
	{
		if(age>18)
			System.out.println("eligible");
		else
			throw new InvalidAgeException("Invalid Age for job ");
	}

}
