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
		s1.close();
	}
}
