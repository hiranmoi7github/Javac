// Wap
import java.util.Scanner;
class Assignment7
{
	public static void main(String args[])
	{
		int n1 = 0, n2 = 1, n,n3;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter number");
         n = sc. nextInt();
         System.out.println(n1+" "+n2);
         for(int i=2;i<n;++i)
		 {
			 n3 = n1 + n2;
              System. out.println(" "+n3);
              n1 = n2;
              n2 = n3; 
		 }
	}
}       
