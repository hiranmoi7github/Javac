//Wap a program to reverse a number
import java.util.Scanner;
class Assignment10
{
	public static void main(String arg[])
	{
		int n,r,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number:");
		n = sc.nextInt();
		while(n!=0)
		{
			r = n%10;
			rev = rev * 10 +r;
			n /= 10;
		}
		System.out.println("Reverse Number is" +rev);
	}
}