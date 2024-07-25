//Program to find the sum of array elements 
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
			sum += num[i];
		}
		System.out.println("The sum of the array elements is : " +sum);
		sc.close();
	}
}
		
