import java.util.Scanner;
class question23
 {
	public static void main(String[] args) 
	{
		int[] h = new int[1000];
		int i = 1, j = 0, r, d = 0, x;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Binary Number: ");
		x = in.nextInt();
		
		while (x > 0)
			{
				r = x % 2;
				d = d + r * i;
				i = i * 2;
				x = x / 10;
			}
		i = 0;
		while (d != 0) 
			{
			h[i] = d % 16;
			d = d / 16;
			i++;
			}
			System.out.print("HexaDecimal value: ");
			for (j = i - 1; j >= 0; j--)
		{
		if (h[j] > 9) 
			{
				System.out.print((char)(h[j] + 55)+"\n");
			}
			else
			{
				System.out.print(h[j]+"\n");
			}
		}
	}
}