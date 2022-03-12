import java.util.Scanner;
class question7
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n1 = sc.nextInt();
		for (int i=1; i<=10; i++)
			
		System.out.println(n1+" * "+i+" = "+n1*i);
	}
}