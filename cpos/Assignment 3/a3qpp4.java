class a3qpp4
{
	public static void main(String args[])
	{
		for (int i=1;i<=9;i++)
		{
			for(int k=9;k>=i;k--)
			{
				System.out.print("  ");
			}
			for (int a=1;a<=i-1;a++)
			{
				System.out.print(a+" ");
			}
			
			for (int j=i;j>=1;j--)
			{
			System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

