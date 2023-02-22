//wap to fimd largest among 3 number using nested if else and also using logical operation
import java.util.Scanner;
class ass3{
		public static void main(String arg[])
		{
			int n1,n2,n3;
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter 3 Number ");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			n3 = sc.nextInt();
			if(n1>n2 && n1>n3)
			{
				System.out.println(+n1+" is the largest number");
				
			}
			if(n2>n1 && n2>n3){
				System.out.println(+n2+" is the largest number");
				
			
			}
			else
			{
				System.out.println(+n3+" is the largest number");
			}
			
			
		}
	
	}