package custom_exceptions;
import java.util.*;
public class MainApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Balance Amount");
		int balanceAmount=sc.nextInt();
		ATM atm=new ATM(balanceAmount);
		while(true)
		{
			System.out.println("Enter Your Choice");
			System.out.println("1-withdraw");
			System.out.println("2-deposit");
			System.out.println("3-show balance");
			System.out.println("4-exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter amount");
				int amount=sc.nextInt();
				atm.withdraw(amount);
				break;
			case 2:
				System.out.println("Enter amount");
			    amount=sc.nextInt();
				atm.deposit(amount);
				break;
			case 3:
				atm.showBalance();
				break;
			case 4:
				System.out.println("Exit");
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
				
			}
		}
	}

}
