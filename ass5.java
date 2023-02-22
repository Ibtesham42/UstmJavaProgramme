//wap to find factorial of a number
import java.util.Scanner;
class ass5
{
	public static void main(String args[])
	{
		int n,fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		n = sc.nextInt();
		for(int i =1;i<=n;i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of a number is": +fact);
	}
}