package Assignment;

public class InvalidAgeException extends RuntimeException{
	String message;

	public InvalidAgeException() {}

	public InvalidAgeException(String message) {
		this.message = message;
	}
	public String toString() 
	{
	   return "InsufficientBalanceException : "+message;	
	}
}
	
	
	


