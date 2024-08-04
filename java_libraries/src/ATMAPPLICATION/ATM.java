package ATMAPPLICATION;

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
			System.out.println("We cannot deposit the amount");
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
			System.out.println("Insufficient Balance");
		}
	}
	public void showBalance()
	{
		System.out.println("The balance amount is "+(balanceAmount));
	}

}
