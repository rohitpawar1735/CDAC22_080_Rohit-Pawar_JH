import java.util.Scanner;
class question6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:" );
		int n1 = sc.nextInt();
		
		System.out.println("Enter the second number:");
		int n2 = sc.nextInt();
		
		int A = n1+n2;
		int B = n1-n2;
		int C = n1*n2;
		int D = n1/n2;
		int E = n1%n2;
		
		System.out.println("Output");
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		System.out.println(E);
		
	}
}