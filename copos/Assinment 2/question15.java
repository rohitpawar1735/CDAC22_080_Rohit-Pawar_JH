import java.util.Scanner;
class question15
{
	public static void main(String args[])
	{
		System.out.println("Before Swap");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st number =");
		float n1 = sc.nextFloat();
		
		System.out.println("Enter the second number =");
		float n2 = sc.nextFloat();
		
		System.out.println("After Swap");
		 
		 float temporary = n2;
		 n2 = n1;
		 n1 = temporary;
		 
		 System.out.println("First number = "+n1);
		 System.out.println("Second number = "+n2);
	}
}