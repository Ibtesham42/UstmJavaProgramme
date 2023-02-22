//wap to reverse a number
import java.util.Scanner;
class ass10{
	public static void main(String args[])
	{
		int n,r,rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Nubmer");
		n = sc.nextInt();
		while(n!=0)
		{
			r = n%10;
			rev = rev * 10  +r;
			n /= 10;
		}
		System.out.println("Reversre Number is"+ rev);
		
	}
}