//Wap to make calculator using switch case
import java.util.Scanner;
class Assignment15
{
	public static void main(String args[])
	{
		double n1,n2,res;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Nubmer");
		n1 = sc.nextDouble();
		System.out.println("Enter Second Nubmer");
		n2 = sc.nextDouble();
		System.out.println("Choose And Operator: Below");
		System.out.println("1.ADDITION ");
		System.out.println("2.SUBTRACTION ");
		System.out.println("3.DIVISION ");
		System.out.println("4.MULTIPLICATION");
		ch = sc.next().charAt(0);
		
		switch(ch)
		{
			case '1':
				res = n1+n2;
				System.out.println(n1 +" + "+ n2 +" = "+ res);
				break;
			case '2':
				res = n1 - n2;
				System.out.println(n1 +" - "+ n2 +" = "+ res);
				break;
			case '3':
				res  = n1/n2;
				System.out.println(n1 +" / "+ n2 +" = "+ res);
				break;
			case '4':
				res = n1 * n2;
				System.out.println(n1 +" * "+ n2 +" = "+ res);
				break;
			case '5':
				return;
			default:
				System.out.println("Invalid Operator");
				break;
			
		}
		
	}
}