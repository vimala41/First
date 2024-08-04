package custom_exceptions;

public class InsufficientBalanceException extends RuntimeException {
	@Override
	public String toString()
	{
		return getClass()+" : Insufficient Balance";
	}

}
