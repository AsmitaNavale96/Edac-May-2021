class Pattern34
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<5;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if((i==j)||(i==5)||(j==1))
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
		System.out.println();
		}
	}
}