class a3qs5
{
	public static void main(String args[])
	{
		for (int i=5;i>=1;i--)
		{
			{
				for (int k=1;k<=i;k++)
				{
					System.out.print(" ");
				}
			}
			for (int j=i;j<=5;j++)
			{
				System.out.print(" "+(char)(j+64));
			}
			System.out.println();
		}
	}
}