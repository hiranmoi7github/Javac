//Wap to calculate number upto number
import java.util.Scanner;
class Assignment4
{
	public static void main(String args[])
	{
		int n,i;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		n = sc.nextInt();
		for(i=0;i<=n;i++)
		{
			sum += i;
		}
		System.out.println(sum);
	}
}