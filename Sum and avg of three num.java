//Program to print the sum & average of three numbers.
import java.util.*;
class sum
{
	public static void main (String ar[])
	{
		int a,b,c;
		Scanner s1 = new Scanner (System.in);
		System.out.println("Enter the first number : ");
		a = s1.nextInt();
		System.out.println("Enter the second number : ");
		b = s1.nextInt();
		System.out.println("Enter the third number : ");
		c = s1.nextInt();
		int sum = a+b+c;
		float avg = sum/3;
		System.out.println("Sum of the three numbers is " +sum);
		System.out.println("Average of the three numbers is " +avg);
		s1.close();
	}
}
