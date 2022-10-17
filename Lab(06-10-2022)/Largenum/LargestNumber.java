/*Create a program to find largest of two number
*/
package Largenum;

public class LargestNumber {

	public static void main(String[] args) //Main Method
	{
		int num1,num2,Large;
		java.util.Scanner sc = new java.util.Scanner(System.in); // Taking User input
		
		System.out.println("Enter First Number :" );
		num1 = sc.nextInt();			//Taking user object
		System.out.println("Enter Second Number :" );
		num2 = sc.nextInt();
		
		if(num1>num2)		// If else Loop
			Large = num1; 

		else
			Large= num2;
		
		System.out.println("Largest="+Large);
	}
}