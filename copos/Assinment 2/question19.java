import java.util.*;
class question19
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr the Decimal number =");
		int x = sc.nextInt();
		int a = x;
		
		String s ="";
		
		while(x>0)
		{
			int y =x%2;
			s = s+y;
			x = x/2;
		}
		System.out.println(" ");
		System.out.println("Binary form of "+a+" is "+s);

	
	
	}
}