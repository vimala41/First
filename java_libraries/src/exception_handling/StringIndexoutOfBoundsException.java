package exception_handling;
import java.util.*;
public class StringIndexoutOfBoundsException {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("main Starts");
		System.out.println("enter any string");
		String s=sc.next();
		System.out.println("Enter index value");
		int i=sc.nextInt();
		int choice=0;
		while(true)
		{
			try
			{
				System.out.println(s.charAt(i));
				break;
			}
			catch(StringIndexOutOfBoundsException e)
			{
				if(choice==3)
				{
					System.out.println("Your limit Has exceeded");
					break;
				}
				System.out.println("You have "+ (3-choice)+ " Chances");
				System.out.println("Enter valid index value");
				i=sc.nextInt();
				choice++;
			}
		}
		System.out.println("Main ends");
		
	}

}
