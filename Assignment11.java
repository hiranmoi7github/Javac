//wap to check palindrone
import java.util.Scanner;
class Assignment11
{
	public static void main(String args[])
	{
		int n,r,temp,rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Nubmer");
		n = sc.nextInt();
		temp = n;
		while(n!=0)
		{
			r = n%10;
			rev = rev * 10  +r;
			n /= 10;
		}
		if(rev == temp)
		{
			System.out.println("Number is Palindrone");
		}
		else{
			System.out.println("Not  Palindrone Number");
		}
		
	}
}