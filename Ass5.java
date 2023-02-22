//Wap to find Factorial of the number
import java.util.Scanner;
class Assignment5
{
    public static void main(String args[])

    {
		int n,fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		n = sc.nextInt();
		for(int i = 1;i<=n;i++);
		{
			fact = fact*1;
		}
		System.out.println("Factorial of a number is :"+fact);
	}
}