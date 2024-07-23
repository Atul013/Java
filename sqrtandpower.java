import java.lang.*;
import java.util.*;
class squareroot
{
	public static void main(String args[])
	{
		int a;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a number : ");
		a = s1.nextInt();
		double roota = Math.sqrt(a);
		System.out.println("The square root is " +roota);
		System.out.println("Enter 2 numbers to calculate the power : ");
		int x = s1.nextInt();
		int y = s1.nextInt();
		double pow = Math.pow(x,y);
		System.out.println("The Exponential value is " +pow);
		s1.close();
	}
}
