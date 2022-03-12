import java.util.*;
class question21
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number =");
		int n = sc.nextInt();
		int y =n;
		int r;   
		String s="";     
		char c[]={'0','1','2','3','4','5','6','7'};  
  
		while(n>0)  
		{  
			r=n%8;   
			s=c[r]+s;   
			n=n/8;  
		}  
		System.out.println("Decimal to octal of "+y+" is: "+s);
	}
}    
  
  