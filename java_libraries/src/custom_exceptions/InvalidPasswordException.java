package custom_exceptions;

public class InvalidPasswordException extends RuntimeException {
	@Override
	public String toString()
	{
		return getClass()+": You entered invalid password";
	}
	

}
