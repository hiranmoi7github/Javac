//Wap to find out number of month in days form user input
import java.util.Scanner;
class Assignment2
{
	public static void main(String args[])
	{
		int n,b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of days :");
		n = sc.nextInt();
		while(n>=30)
		{
			n = n-30;
			b++;
		}
		System.out.println("Number of Month = "+b);
		System.out.println("Number of Days = "+n);
	}
}