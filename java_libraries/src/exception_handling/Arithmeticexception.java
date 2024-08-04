package exception_handling;
import java.util.*;
public class Arithmeticexception {
	public static void main(String argvs[])  
	{  
		Scanner sc=new Scanner(System.in);
		System.out.println("Main Starts");
		System.out.println("Enter A Number");
		int a=sc.nextInt();
		System.out.println("Enter B Nummber");
		int b=sc.nextInt();
		int choice=0;
		while(true)
		{
		try {
			System.out.println(a/b);
			break;
		}
		catch(ArithmeticException ex)
		{
			if(choice==3)
			{
				System.out.println("Your Account is Blocked");
				break;
			}
				System.out.println("You have "+(3-choice) +" Chances");
			System.out.println("Enter valid B number");
			b=sc.nextInt();
			}
			choice++;
		}
		System.out.println("Main Ends");
	}  
}  

