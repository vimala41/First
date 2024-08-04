package custom_exceptions;

public class ATM implements Bank {
	private int balanceAmount;
	ATM(int balanceAmount)
	{
		this.balanceAmount=balanceAmount;
	}

	@Override
	public void deposit(int amount)
	{
		if(amount>0)
		{
			System.out.println("The Deposited amount is "+amount);
			System.out.println("The balance amount is "+(balanceAmount+amount));
		}
		else
		{
			//System.out.println("We cannot deposit the amount");
			try {
			throw new   NegativeAmountException();
			}
			catch(NegativeAmountException e) {
				System.out.println("Enter valid Amount");
			}
		}
	}
	public void withdraw(int amount)
	{
		if(amount<=balanceAmount)
		{
			System.out.println("The Deposited amount is "+amount);
			System.out.println("The balance amount is "+(balanceAmount-amount));
		}
		else
		{
			//System.out.println("Insufficient Balance");
			try{
				throw new  InsufficientBalanceException();
			}
			catch(InsufficientBalanceException e)
			{
				System.out.println("Enter valid Amount");
			}
		}
	}
	public void showBalance()
	{
		System.out.println("The balance amount is "+(balanceAmount));
	}

}
