//Program to multiply two matrices
import java.util.*;
class product
{
	public static void main (String args[])
	{
		int a[][] = new int [50][50];
		int b[][] = new int [50][50];
		int prod [][] = new int [50][50];
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the number of Rows of first matrix: ");
		int r1 = s.nextInt();
		System.out.print("Enter the number of Columns of first matrix: ");
		int c1 = s.nextInt();
		System.out.print("Enter the number of Rows of second matrix: ");
		int r2 = s.nextInt();
		System.out.print("Enter the number of Columns of second matrix: ");
		int c2 = s.nextInt();
		if (c1 != r2)
		{
			System.out.println("Matrix multiplication not possible!");
			System.exit(0);
		}
		
		System.out.println("Enter the elements of the first matrix :");
		for (int i =0; i<r1; i++)
		{
			for (int j =0; j<c1; j++)
			{
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter the elements of the second matrix :");
		for (int i =0; i<r2; i++)
		{
			for (int j =0; j<c2; j++)
			{
				b[i][j] = s.nextInt();
			}
		}
		System.out.println("Product of the two arrays is :");
		for (int i =0; i<r2; i++)
		{
			for (int j =0; j<c1; j++)
			{	
				prod[i][j] = 0;
				for(int k =0; k<c1; k++)
				{
					prod[i][j]+= a[i][k]*b[k][j];
				}
				
				System.out.print(prod[i][j] + "\t");
			}
			System.out.println("\n");
		}
		s.close();
	}
}
		
