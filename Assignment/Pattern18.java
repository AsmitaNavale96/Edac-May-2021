class Pattern18
{
	public static void main(String args[])
	{
		int k=64;
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+(char)(k+j));
			}
			System.out.println();
		}
	}
}
			
			
			
			