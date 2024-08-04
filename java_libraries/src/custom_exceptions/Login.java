package custom_exceptions;
import java.util.*;
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The User Name");
		String userName=sc.next();
		System.out.println("Enter Password");
		int pwd=sc.nextInt();
		if(userName.equalsIgnoreCase("Admin"))
		{
			if(pwd==123)
			{
				System.out.println("Login");
			}
			else
			{
				//System.out.println("Invalid password");
				InvalidPasswordException e=new InvalidPasswordException();
				throw e;
			}
		}
		else
		{
			//System.out.println("Invalid User Name");
			InvalidUsernameException e=new InvalidUsernameException();
			throw e;
		}
		
	}

}
