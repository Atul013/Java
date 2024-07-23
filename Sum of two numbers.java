//Program to print the sum of two numbers.
import java.util.*;
class sum
{
	public static void main (String ar[])
	{
		int a,b;
		Scanner s1 = new Scanner (System.in);
		System.out.println("Enter the first number : ");
		a = s1.nextInt();
		System.out.println("Enter the second number : ");
		b = s1.nextInt();
		int sum = a+b;
		System.out.println("Sum of the two numbers is " +sum);
		s1.close();
	}
}
