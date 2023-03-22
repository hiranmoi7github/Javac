//Wap to convert binary to  decimal number n vice versa
import java.util.Scanner;
class Assignment16
{
	public static void main(String args[])
	{
			int n,dec= 0,base =1,last_digit;
			Scanner bc = new Scanner(System.in);
			System.out.println("Enter Number");
			n = bc.nextInt();
			int temp = n;
			while(temp!=0)
			{
				last_digit = temp%10;
				temp = temp /10;
				dec += last_digit * base;
				base = base *2;
			}
			System.out.println("Value is"+dec);
	}
			
			
			
			
}