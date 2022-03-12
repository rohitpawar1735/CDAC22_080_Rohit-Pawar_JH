import java.util.*;
class question22
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the binary number =");
		int n = sc.nextInt();
		int y =n;
		int d = 0;  
		int x = 0;  
		while(true)
		{  
			if(n == 0)
			{  
				break;  
			} 
		else
			{  
          int temp = n%10;  
          d+= temp*x*x;  
          n = n/10;  
          x++;  
			} 
		}
		System.out.println("Decimal of 1010 is: "+d);		
    }  
   
}  
