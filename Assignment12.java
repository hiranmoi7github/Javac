//Wap to check a number is prime or not
import java.util.Scanner;
class Assignment12
{
	public static void main(String arga[])
	{
		int n,m = 0, flag =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		n = sc.nextInt();
		if(n ==1 || n==0)
		{
			System.out.println("Number is NOT Prime");
		}
		else{
			for(int i =2;i<m;i++)
			{
				if(n%i == 0)
				{
					System.out.println("Number is NOT prime");
					flag = 1;
					break;
				}
			}
			if(flag == 0)
			{
				System.out.println("Number is Prime");
			}
		}
	
	}
}