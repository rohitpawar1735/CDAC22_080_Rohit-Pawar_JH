import java.util.*;
class question20
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number =");
		int n = sc.nextInt();
		int y =n;
		int r;  
		String A="";   
		char C[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
		while(n>0)  
		{  
			r=n%16;   
			A=C[r]+A;   
			n=n/16;  
		}  
		System.out.println("Hexadecimal form of "+y+" is: "+A);
	}	
}