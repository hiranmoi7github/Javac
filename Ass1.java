 //Wap to swap two numbers without using 3rd variable
 import java.util.Scanner;
 class Assignment1
 {
	 public static void main(String args[])
	 {
		 Scanner in = new Scanner(System.in);
		 int a,b;
		 System.out.print("Enter the two Number:");
		 a = in.nextInt();
		 b = in.nextInt();
		 System.out.println("Before swapping: a="+a+" b="+b);
		 a = a+b;
		 b = a-b;
		 a = a-b;
		 System.out.println("After Swapping: a="+a+" b="+b);
	 }
 }