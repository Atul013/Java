import java.util.*;
class student
{
	public static void main(String args[])
	{
		Scanner s1 = new Scanner(System.in);
        String cls, name;
		System.out.println("Enter your Name : ");
		name = s1.nextLine();
		System.out.println("Enter your Class : ");
		cls = s1.nextLine();
        System.out.println("Enter your Roll Number : ");
		int rollno = s1.nextInt();
		System.out.println("Name : " +name);
		System.out.println("Class : " +cls);
		System.out.println("Roll Number : " +rollno);
        s1.close();
    }
}
