import java.util.Scanner;
class question5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n1 = sc.nextInt();
		
		System.out.println("Enter second number:");
		int n2 = sc.nextInt();
		
		int X = n1*n2;
		System.out.println("output = "+X);
	}
}