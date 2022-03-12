class a3qpp5
{
	public static void main(String args[])
	{
		for (int i=9;i>=1;i--)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print("  ");
			}
			for (int a=i;a<=8;a++)
			{
				System.out.print(a+" ");
			}
			
			for (int j=9;j>=i;j--)
			{
			System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}



