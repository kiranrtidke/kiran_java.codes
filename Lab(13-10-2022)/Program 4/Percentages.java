package lab;

import java.util.*;
public class Percentages {

	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter The Number :");
			int num = sc.nextInt();
			
			if(num >= 90)
			{
				System.out.println("grade A");
			}
			
			else if (num >=84 && num<=90)
			{
				System.out.println("grade A1");
			}
			else if (num >=74 && num<=84)
			{
				System.out.println("grade B");
			}
			else if (num>=64 && num <= 74)
			{
				System.out.println("grade C");
			}
			else if (num<=64 && num >=34)
			{
				System.out.println("grade C");
			}
			else
			{
				System.out.println("fail");
			}
		}
	}
}
