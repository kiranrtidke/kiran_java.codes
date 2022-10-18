package lab;

/*Program to Print sum of only Positive numbers using do-while Loop.
 *  And take the Input from User, Enters any negative number then that number should not added to sum.
 */

import java.util.*;
public class Positive_Number {
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter 1st number : ");
			int num1=sc.nextInt();
			System.out.println("Enter 2nd Number : ");
			int num2= sc.nextInt();
			int num = num1+num2;		// Taking 2 number
			int i = 0;
			if(i>=0) // if loop 
			{
				num=num+i;
			}
			do		// Do while loop
			{
				//System.out.println("Enter 2nd Number : ");
				break;
			}
			while(num>=0);
			{
				System.out.println("it is : "+num);

			}
		}
	}

}
