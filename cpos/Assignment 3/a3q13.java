class a3q13
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)
		{
			{
				for (int k=5;k>=i;k--)
				{
					System.out.print(" ");
				}
			}
			for (int j=i;j>=1;j--)
			{
				System.out.print(" "+(char)(i+64));
			}
			System.out.println();
		}
	}
}