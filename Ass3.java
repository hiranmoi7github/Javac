//Wap to find the largest among 3 number using nested if else and also using logical operation
import java.util.Scanner;
class Assignment3
{
	public static void main(String args[])
	{
		int n1,n2,n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers :");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		if(n1>n2 && n1>n3)
		{
			System.out.println(+n1+"is the largest number");
		}
		if(n2>n1 && n2>n3)
		{
			System.out.println(+n2+"is the largest number");
		}
		else
		{
			System.out.println(+n3+"is the largest number");
		}
	}
}