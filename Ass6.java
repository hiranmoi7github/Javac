//Wap to generate multiplication table upto n
import java.util.Scanner;
class Assignment6
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number :");
		n = sc.nextInt();
		for(int i = 1; i<=10;i++)
		{
			System.out.println(+ n +" x " + i +" = " + n * i);
		}
	}
}