import java.util.*;
class question24 
{
	public static void main(String[] args) 
		{
        int b, b2,r, d=0, n, i=1, j;
        int o[] = new int[100];
		
        Scanner scan = new Scanner(System.in);
		System.out.print("Enter Binary Number : ");
        b = scan.nextInt();
        b2 = b;
     
		while(b > 0)
        {
            r = b % 10;
            d = d + r*i;
            i = i*2;
            b = b/10;
        }   

			i=1;
			n = d;
		
			while(n > 0)
			{
				o[i++] = n % 8;
				n = n / 8;
			}
		
			System.out.print("Octal Value of " +b2+ " is :");
			for(j=i-1; j>0; j--)
			{
				System.out.print(o[j]);
			}
			System.out.print("\n");
 
    }
}