package custom_exceptions;

public class InvalidUsernameException extends RuntimeException{
	@Override
	public String toString()
	{
		return getClass()+": You entered invalid userName";
	}

}
