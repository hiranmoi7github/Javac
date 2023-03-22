//Wap to print prime number btwn two intervals
import java.util.Scanner;
class Assignment13
{
	public static void main(String args[])
	{
		int n,i,m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number:);
		n = sc.nextInt();
		if(n == 1|| n==0)
		{
			System.out.println("Number is Not Prime: "+ n);
		}
		else{
		for(i=2;i<=n;i++)
		{
			m =n%i;
			if(n%i==0)
			{
				System.out.println("Number is not prime " + m);
			}
			else
			{
				System.out.println("Number is Prime" + m);
			}
		}
		}
		
	}
}