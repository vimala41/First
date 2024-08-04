package custom_exceptions;

public class InvalidAgeException extends RuntimeException {
	@Override
	public String toString()
	{
		return getClass()+": Age is not sufficient to vote";
	}

}
