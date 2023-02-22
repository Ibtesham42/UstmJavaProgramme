//wap to swap to number without using 3rd variable
import java.util.Scanner;
class swap{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number ");
		a = sc.nextInt();
		System.out.println("Enter Second number ");
		b = sc.nextInt();
		System.out.println("Number Before Swapping:  a = "+a+" b ="+b);
		a = a + b;
		b = a - b;
		a = a-b;
		System.out.println("Number After Swapping:  a = "+a+" b ="+b);
	}
}