/*Create a program for calculation read three value from the user for operation first 
 * and second value as operands the third value as operator.
 * 
 */


package Calculation;

public class Calculations {
	
	public static void main(String[] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in); // Taking User input
		
		System.out.println("Enter First Number :" );
		int num1 = sc.nextInt();			//Taking user object
		System.out.println("Enter Second Number :" );
		int num2 = sc.nextInt();
		
		System.out.println("Enter 1 for add   Enter 2 for sub   Enter 3 for multi   Enter 4 for div");// Entering the number between 1 to 4 for arithmetic operators
		
		int input = sc.nextInt(); // Taking Input from user
		switch(input)				// Switch case
		{
		case 1: 
			System.out.println(num1+num2);
			break;
		case 2:
			System.out.println(num1-num2);
			break;

		case 3:
			System.out.println(num1*num2);
			break;

		case 4:
			System.out.println(num1/num2);
			break;


		}
		
	}

}