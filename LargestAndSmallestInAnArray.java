//Program to find the Largest and Smallest element in an integer array
import java.util.*;
class sum
{
	public static void main (String args[])
	{
		int num [] = new int [50];
		int sum =0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the array Size : ");
		int size = sc.nextInt();
		System.out.println("Enter the " +size+ " array elements : ");
		for (int i=0; i<size; i++)
		{
			num [i] = sc.nextInt();
		}
		int large = num[0];
		int small = num[0];
		for (int i=0; i<size; i++)
		{
			if (num[i] > large)
			{
				large = num[i];
			}
			else if (num[i] < small)
			{
				small = num[i];
			}
		}
		System.out.println("The largest array elements is : " +large);
		System.out.println("The smallest array elements is : " +small);
		sc.close();
	}
}
		
