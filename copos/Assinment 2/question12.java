import java.util.Scanner;
class question12
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number =");
		int n1 = sc.nextInt();
		
		System.out.println("Enter second number =");
		int n2 = sc.nextInt();
		
		System.out.println("Enter third number =");
		int n3 = sc.nextInt();
		
		int A = (n1+n2+n3)/3;
		
		System.out.println("Average of three numbers is "+A);
	}	
}