//wap to find out number of month & days form user input number
import java.util.Scanner;
class ass2{
	public static void main(String args[])
	{
		int n,b=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Days ");
		n = sc.nextInt();
		while(n>=30)
		{
			n = n-30;
			b++;
		}
		System.out.println("Number of month = "+b);
		System.out.println("Number of Days ="+n);
		
		
	}

}