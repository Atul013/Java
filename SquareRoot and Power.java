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
		System.out.println("The square root of " +a+ " is " +roota);
		System.out.println("Enter the two numbers to find power of the number:");
		double x, y, pow;
		x=s1.nextDouble();
		y=s1.nextDouble();
		pow=Math.pow(x,y);
		System.out.println("The " +y+ " power of "+x+" is:"+pow);
		s1.close();
	}
}
