package custom_exceptions;

public class NegativeAmountException  extends RuntimeException {
	@Override
	public String toString()
	{
		return getClass()+" : Negative Amount";
	}

}
