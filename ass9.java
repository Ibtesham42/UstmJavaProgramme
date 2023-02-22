//wap to count number of digit in an integer
import java.util.Scanner;
class ass9{
	public static void main(String args[])
	{
		int n,count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		n =sc.nextInt();
		while(n!=0)
		{
			n /= 10;
			count++;
		}
		System.out.println("number of digit entered are: "+ count);
		
		
	}
	
}