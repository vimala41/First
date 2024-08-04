/**
 * 
 */
package exception_handling;
import java.util.*;
public class ArrayIndexoutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("main Starts");
		int a[]= {1,2,3,4,5,6};
		System.out.println("Enter Index Value");
		int i=sc.nextInt();
		int choice=0;
		while(true)
		{
			try
			{
				System.out.println(a[i]);
				break;
			}
			catch(ArrayIndexOutOfBoundsException e)
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
