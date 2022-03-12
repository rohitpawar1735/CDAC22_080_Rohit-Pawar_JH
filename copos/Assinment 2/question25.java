import java.util.*;

class question25
 {
	public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			long o, d = 0;
			int i = 0;
			System.out.print("Enter octal number: ");
			o = sc.nextLong();
			while (o != 0) 
			{
				d = (long)(d + (o % 10) * Math.pow(8, i++));
				o = o / 10;
			}
				System.out.print("Equivalent decimal number: " + d+"\n");
		}
}