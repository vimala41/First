package custom_exceptions;
import java.util.*;
public class AgecheckForVote {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String name="Dinga";
		System.out.println("Enter Age");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println(name+" Eligible for voting");
		}
		else
		{
			throw new InvalidAgeException();
			
		}
	}
	

}
